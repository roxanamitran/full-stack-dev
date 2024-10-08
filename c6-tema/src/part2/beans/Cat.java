package part2.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Cat implements IAnimal {
    @Override
    public String makeSound() {
        return "Miau-Miau";
    }
}
