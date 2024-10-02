package io.roxanamitran;

import io.roxanamitran.beans.Cat;
import io.roxanamitran.beans.Dog;
import io.roxanamitran.beans.IAnimal;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAnimal cat = context.getBean("myCat", Cat.class);
        IAnimal bigDog = context.getBean("bigDog", Dog.class);
        IAnimal littleDog = context.getBean("littleDog", Dog.class);

        System.out.println(cat);
        System.out.println(bigDog);
        System.out.println(littleDog);
        context.close();
    }
}
