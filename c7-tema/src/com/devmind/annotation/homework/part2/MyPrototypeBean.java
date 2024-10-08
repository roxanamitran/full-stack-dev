package com.devmind.annotation.homework.part2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyPrototypeBean {
    static int objectCounter = 0;
    public MyPrototypeBean() {
        objectCounter++;
        System.out.println("Current number of instances(MyPrototypeBean): " + objectCounter);
    }

    @PostConstruct
    private void init() {
        System.out.println("Prototype: This method is called at initialization");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Prototype: This method is called at destruction. Use this to free resources.");
    }
}
