package io.roxanam.quiz5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StudentConfiguration {

    @Bean
    public Student student() {
        return new Student("X", "Y", 8);
    }

    @Bean
    @Scope("prototype")
    public Student studentPrototype() {
        Student student = new Student(null, null, 0);
        student.setFirstName("A");
        student.setLastName("B");
        student.setGrade(9);
        return student;
    }
}
