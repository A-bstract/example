package com.example.demoenvironment.extest;

import com.example.demoenvironment.annotation.DEMO_ANNOTATION;
import com.example.demoenvironment.model.DEMO_MODEL;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: chuan
 * @create: 2019-10-29 17:12
 * @note
 **/
@SpringBootTest
@Slf4j
public class AnnotationTest {

    @Test
    public void test() throws Exception {
        Class<DEMO_MODEL> demoModelClass = DEMO_MODEL.class;
        Method[] declaredMethods = demoModelClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            DEMO_ANNOTATION annotation = method.getAnnotation(DEMO_ANNOTATION.class);
            String value = annotation.value();
            log.info("方法注解值：" + value);
        }
    }

    @Test
    public void getClassAnnotation(){
        Class<DEMO_MODEL> demoModelClass = DEMO_MODEL.class;
        DEMO_ANNOTATION annotationClass = demoModelClass.getAnnotation(DEMO_ANNOTATION.class);
        String value = annotationClass.value();
        log.info("类注解值：" + value);
    }}
