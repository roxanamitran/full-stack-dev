package com.devmind.annotation.homework.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Masina implements Automobil{

    @Autowired
    private Motor motor;

    @Override
    public String travel() {
        return "Soferul conduce intr-un mod sportiv.";
    }

    @Override
    public String maxDrivingSpeed() {
        return "180 km/h";
    }
}
