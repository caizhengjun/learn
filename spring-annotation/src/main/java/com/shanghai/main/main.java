package com.shanghai.main;

import com.shanghai.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/20 12:49 下午
 */
public class main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (String definitionName : beanDefinitionNames) {
            System.out.println(definitionName);
        }
    }
}
