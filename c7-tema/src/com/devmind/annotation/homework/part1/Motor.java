package com.devmind.annotation.homework.part1;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Motor {
    private String putere;
    private String nume;
    private int numarCilindri;
}
