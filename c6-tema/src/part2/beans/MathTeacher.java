package part2.beans;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements ITeacher {
    @Override
    public String getHomeWork() {
        return "Do your homework!";
    }
}
