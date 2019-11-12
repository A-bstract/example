package com.example.order.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer1 {

    /*@RabbitListener(queues = Constans.QUEUE_LOG_OPER,containerFactory = "LISTENER_OPER_LOG")
    public void operLogConsumer(Message message,
                                Channel channel) throws IOException, InterruptedException {
        System.out.println(new String(message.getBody()));
        Thread.sleep(3000);
        // ACK 消息确认
        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
    }*/
}
