package part2.beans;

import org.springframework.stereotype.Component;

@Component
public class Mouse implements IAnimal {
    @Override
    public String makeSound() {
        return "Chit-Chit";
    }
}
