package io.roxanam.quiz5;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

@Data
public class Student {
    private String lastName;
    private String firstName;
    private int grade;


    public Student(String lastName, String firstName, int grade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.grade = grade;
    }


}
