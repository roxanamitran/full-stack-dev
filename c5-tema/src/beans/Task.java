package beans;

import java.util.Random;

public class Task {
    private static Random random = new Random();
    private static int numberOfTasks;
    private static int randomId;

    private String taskName;
    private Integer taskId;
    private Integer executionTime;

    public static int getNumberOfTasks() {
        return numberOfTasks;
    }

    public void run() throws InterruptedException {
        Thread.sleep(executionTime);
    }

    public Integer generateId() {
        return randomId++;
    }

    public void init() {
        numberOfTasks++;
        taskId = generateId();
        taskName = "Task" + taskId;
        executionTime = random.nextInt(20) + 1;
    }

    public void destroy() {
        System.out.println("Task " + taskName + " destroyed");
        numberOfTasks--;
    }
}
