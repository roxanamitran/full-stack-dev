package com.devmind.annotation.homework.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motocicleta implements Automobil {

    private Motor motor;

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String travel() {
        return "Motociclistul este atent in trafic.";
    }

    @Override
    public String maxDrivingSpeed() {
        return "130 km/h";
    }
}
