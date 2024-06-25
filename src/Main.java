package Task;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();    
        manager.addTask("Learn Java");  //Task hinzufügen
        manager.addTask("Write Code");  //Task hinzufügen
        manager.showTasks();                        //Tasks anzeigen

        manager.markTaskAsCompleted(1);          //Tasks mit ID 1 als erledigt makieren
        manager.showTasks();                        //Tasks erneut anzeigen
    }
}