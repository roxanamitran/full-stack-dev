import beans.Task;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Before creating context");
        // Number of tasks should be 0
        System.out.println("Number of taks: " + Task.getNumberOfTasks());
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
        System.out.println("After creating context");
        // numberOfTaks value should be 1, for the singleton bean
        System.out.println("Number of taks: " + Task.getNumberOfTasks());

        // Create 2 prototype beans
        Task secondTask = context.getBean("prototypeTask", Task.class);
        context.getBean("prototypeTask");

        // numberOfTaks value should be 3, for the singleton bean and the 2 prototype beans
        System.out.println("Number of taks: " + Task.getNumberOfTasks());

        context.close();

        // numberOfTaks value should be 2, because only the singleton's bean destroy method was called
        // so numberOfTasks value was decremented only once, prototype beans destroy method is not
        // called by spring context
        System.out.println("Number of taks: " + Task.getNumberOfTasks());

        System.out.println("=== AOP ===");
        secondTask.run();
    }
}