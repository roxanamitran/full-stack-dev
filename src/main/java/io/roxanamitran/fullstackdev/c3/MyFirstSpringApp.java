package io.roxanamitran.fullstackdev.c3;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c3-applicationContext.xml");
        ITeacher theTeacher = context.getBean("javaTeacher", ITeacher.class);
        System.out.println(theTeacher.getHomework());
        context.close();
    }
}
