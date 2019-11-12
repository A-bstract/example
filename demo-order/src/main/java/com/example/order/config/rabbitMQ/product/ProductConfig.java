package com.example.order.config.rabbitMQ.product;


import com.example.demoenvironment.constan.Constans;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {


    /*@Bean
    public Queue operLogQueue(){
        return new Queue();
    }

    @Bean
    public DirectExchange logDirectExchange(){
        return new DirectExchange(Constans.EXCHANGE_DIRECT_LOG_EXCHANGE);
    }

    @Bean
    public Binding logBind(){
        BindingBuilder.DestinationConfigurer bind = BindingBuilder.bind(operLogQueue());
        BindingBuilder.DirectExchangeRoutingKeyConfigurer to = bind.to(logDirectExchange());
        Binding with = to.with(Constans.LOG_BIND_KEY);
        return with;
    }*/

}
