package com.devmind.annotation.homework.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver {

    @Autowired
    @Qualifier("masina")
    private Automobil automobil;

    public void drive() {
        System.out.println(automobil.travel());
    }
}
