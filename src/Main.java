package Task;

/**
 * Hauptklasse zum Ausführen des TaskManagers.
 */
public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();    
        manager.addTask("Java lernen");
        manager.addTask("Code schreiben");
        manager.showTasks();

        manager.markTaskAsCompleted(1);
        manager.showTasks();
    }
}