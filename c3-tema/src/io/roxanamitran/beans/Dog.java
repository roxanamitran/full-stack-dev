package io.roxanamitran.beans;

public class Dog implements IAnimal {
    private String name;

    @Override
    public String makeSound() {
        return "Ham-Ham";
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Dog " + name;
    }
}
