package part2.beans;

import org.springframework.stereotype.Component;

@Component("ourOwnDevTeacher")
public class WebDevTeacher implements ITeacher {
    @Override
    public String getHomeWork() {
        return "Create your server backend context!";
    }
}