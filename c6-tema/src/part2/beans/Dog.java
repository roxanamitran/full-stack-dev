package part2.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Dog implements IAnimal {
    private String name;

    @Override
    public String makeSound() {
        return "Ham-Ham";
    }
}
