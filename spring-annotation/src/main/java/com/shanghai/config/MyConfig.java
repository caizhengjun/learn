package com.shanghai.config;

import com.shanghai.bean.Person;
import com.shanghai.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/20 1:02 下午
 */
@Configuration
@ComponentScan(value = "com.shanghai", excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,
                        classes = {Controller.class})
        }, includeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
                        classes = {BookService.class})
        }, useDefaultFilters = false)
public class MyConfig {

    @Scope
    @Bean("person")
    public Person person01() {
        return new Person("蔡正峻", 27);
    }
}
