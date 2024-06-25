package Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private int nextId;

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String description) {
        tasks.add(new Task(nextId++, description));
    }

    public void showTasks() {
        for (Task task : tasks) {
            System.out.println(task.getId() + ": " + task.getDescription() + " (Completed: " + task.isCompleted() + ")");
        }
    }

    public void markTaskAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(false);
                break;
            }
        }
    }
}