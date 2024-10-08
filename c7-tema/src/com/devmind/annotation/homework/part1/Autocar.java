package com.devmind.annotation.homework.part1;

import org.springframework.stereotype.Component;

@Component
public class Autocar implements Automobil {

    private Motor motor;

    public Autocar(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String travel() {
        return "Soferul conduce prudent.";
    }

    @Override
    public String maxDrivingSpeed() {
        return "90 km/h";
    }
}
