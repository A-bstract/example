package com.example.order.test;

import com.demo.rabbitmqdemo.demo.env.Constans;
import com.demo.rabbitmqdemo.demo.env.exception.MQException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class SendProductMessage implements RabbitTemplate.ConfirmCallback , RabbitTemplate.ReturnCallback{

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping(value = "/test/productTest")
    public void productTest(){
        rabbitTemplate.setExchange(Constans.EXCHANGE_DIRECT_LOG_EXCHANGE);
        rabbitTemplate.setRoutingKey(Constans.LOG_BIND_KEY);
        String message = "Hellow Word!";
        MessageBuilder messageBuilder = MessageBuilder.withBody(message.getBytes());
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                rabbitTemplate.setConfirmCallback(this);
                rabbitTemplate.convertAndSend(messageBuilder.build());
            });
        }
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        System.out.println("生产者回调。");
        System.out.println("correlationData:" + correlationData);
        System.out.println("b:" + b);
        System.out.println("s:" + s);

        if(!b){
            throw new MQException(Enum.MQExceptionType.PRODUCT_PUSH_FAIL);
        }

        try {

        }catch (MQException mq){
            String errCode = mq.getErrCode();

        }
    }

    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {

    }


}
