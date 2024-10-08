package part2;

import part2.beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-part2.xml");

        IAnimal cat = context.getBean("cat", Cat.class);
        IAnimal bigDog = context.getBean("dog", Dog.class);
        ITeacher teacher = context.getBean("mathTeacher", ITeacher.class);
        System.out.println(cat);
        System.out.println(bigDog);
        System.out.println(teacher.getHomeWork());

        context.close();
    }
}