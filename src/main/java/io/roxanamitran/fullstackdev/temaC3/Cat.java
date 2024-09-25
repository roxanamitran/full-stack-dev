package io.roxanamitran.fullstackdev.temaC3;

public class Cat implements IAnimal{
    @Override
    public String makeSound() {
        return "Miau-Miau";
    }

    public String toString() {
        return "Cat";
    }
}
