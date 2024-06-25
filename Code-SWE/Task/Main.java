package Task;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Learn Java");
        manager.addTask("Write Code");
        manager.showTasks();

        manager.markTaskAsCompleted(1);
        manager.showTasks();
    }
}