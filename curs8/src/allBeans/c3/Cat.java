package allBeans.c3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat implements IAnimal {
    private String name;
    @Override
    public String makeSound() {
        return "Miau-Miau";
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }

    @Autowired
    public Cat(String name) {
        this.name = name;
    }



}
