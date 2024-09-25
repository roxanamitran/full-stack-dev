package io.roxanamitran.fullstackdev.temaC3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("temaC3-applicationContext.xml");

        IAnimal myCat = context.getBean("myCat", IAnimal.class);
        IAnimal bigDog = context.getBean("bigDog", IAnimal.class);
        IAnimal littleDog = context.getBean("littleDog", IAnimal.class);

        System.out.println(myCat);
        System.out.println(bigDog);
        System.out.println(littleDog);

    }
}
