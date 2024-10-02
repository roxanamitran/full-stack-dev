package io.roxanamitran.beans;

public class Cat implements IAnimal {
    @Override
    public String makeSound() {
        return "Miau-Miau";
    }

    public String toString() {
        return "Cat";
    }
}
