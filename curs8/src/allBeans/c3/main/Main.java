package allBeans.c3.main;

import allBeans.c3.IAnimal;
import allBeans.c3.config.ApplicationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        System.out.println(context.getBean("littleDog"));
        System.out.println(context.getBean("bigDog"));
        System.out.println(context.getBean("cat"));

        IAnimal animal1 = context.getBean("littleDog", IAnimal.class);
        System.out.println(animal1.makeSound());
        IAnimal animal2 = context.getBean("cat", IAnimal.class);
        System.out.println(animal2.makeSound());

    }
}
