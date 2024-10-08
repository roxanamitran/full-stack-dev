package com.devmind.annotation.homework.part2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {
    public static void main(String args[]) {

        System.out.println("----- Before context initialization");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-part2.xml");
        System.out.println("----- Before getBean calls");

        context.getBean(MyPrototypeBean.class);
        context.getBean(MyPrototypeBean.class);
        context.getBean(MyPrototypeBean.class);

        context.getBean(MySingletonBean.class);
        context.getBean(MySingletonBean.class);
        context.getBean(MySingletonBean.class);

        System.out.println("----- After getBean calls");
        System.out.println("Current number of instances(singleton): " + MySingletonBean.objectCounter);
        System.out.println("Current number of instances(prototype): " + MyPrototypeBean.objectCounter);

        context.close();

        System.out.println("----- After context closed");
    }
}
