package io.roxanam.quiz5;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);

        Student s1 = context.getBean("student", Student.class);

        Student s2 = context.getBean("studentPrototype", Student.class);

        //SINGLETON
        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getGrade());

        //PROTOTYPE
        System.out.println(s2.getFirstName());
        System.out.println(s2.getLastName());
        System.out.println(s2.getGrade());
        context.close();    
    }

}
