package Task;
import java.util.ArrayList;
import java.util.List;

/**
 * Verwaltert eine Liste von Aufgaben, einschließlich dem Hinzufügen neuer Aufgaben und dem Markieren von Aufgaben als abgeschlossen.
 */
public class TaskManager {
    private List<Task> tasks;
    private int nextId; 

    /**
     * Konstruiert einen neuen TaskManager mit einer leeren Aufgabenliste und initialisiert die nächste Aufgaben-ID auf 1.
     */
    public TaskManager() {
        tasks = new ArrayList<>();
        nextId = 1;
    }

    /**
     * Fügt eine neue Aufgabe mit der gegebenen Beschreibung zur Aufgabenliste hinzu.
     *
     * @param description die Beschreibung der neuen Aufgabe
     */
    public void addTask(String description) {
        tasks.add(new Task(nextId++, description));
    }

    /**
     * Zeigt alle Aufgaben in der Aufgabenliste an, einschließlich ihrer IDs, Beschreibungen und Fertigstellungsstatus.
     */
    public void showTasks() {
        for (Task task : tasks) {
            System.out.println(task.getId() + ": " + task.getDescription() + " (Abgeschlossen: " + task.isCompleted() + ")");
        }
    }

    /**
     * Markiert die Aufgabe mit der angegebenen ID als abgeschlossen.
     *
     * @param id die ID der zu markierenden Aufgabe
     */
    public void markTaskAsCompleted(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setCompleted(true);
                break;
            }
        }
    }
}