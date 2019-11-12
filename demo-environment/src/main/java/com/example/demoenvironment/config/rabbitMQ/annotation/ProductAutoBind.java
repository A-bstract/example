package com.example.demoenvironment.config.rabbitMQ.annotation;

import com.example.demoenvironment.constan.Enum;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ProductAutoBind {

    Enum.MQProductBind bindName();
}
