package allBeans.c8;

import org.springframework.stereotype.Component;

@Component
public class JavaTeacher implements ITeacher {
    private WisdomWordsService wisdomService;


    public JavaTeacher(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

    @Override
    public String getHomeWork() {
        return "Create 100 classes";
    }

    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }

    public void setWisdomService(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }
}