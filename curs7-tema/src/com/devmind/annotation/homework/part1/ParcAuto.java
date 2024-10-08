package com.devmind.annotation.homework.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParcAuto {
    private Autocar autocar;
    private Masina masina;
    @Autowired
    private Motocicleta motocicleta;

    public ParcAuto(Autocar autocar) {
        this.autocar = autocar;
    }

    @Autowired
    public void setMasina(Masina masina) {
        this.masina = masina;
    }
}
