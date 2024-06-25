package Task;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;
    private int nextId; 

    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;              // Start der ID-Zählung bei 1
    }

    public void addTask(String description) {
        tasks.add(new Task(nextId++, description)); // Neue Aufgabe hinzufügen
    }

    public void showTasks() {
        for (Task task : tasks) {
            // Aufgabe mit ID, Beschreibung und Erledigungsstatus anzeigen
            System.out.println(task.getId() + ": " + task.getDescription() + " (Completed: " + task.isCompleted() + ")");
        }
    }

    public void markTaskAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true); // Aufgabe als erledigt markieren
                break;
            }
        }
    }
}