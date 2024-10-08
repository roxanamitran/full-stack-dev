package com.devmind.annotation.homework.part2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MySingletonBean {
    static int objectCounter = 0;
    public MySingletonBean() {
        objectCounter++;
        System.out.println("Current number of instances(MySingletonBean): " + objectCounter);
    }

    @PostConstruct
    private void init() {
        System.out.println("Singleton: This method is called at initialization");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Singleton: This method is called at destruction. Use this to free resources.");
    }
}
