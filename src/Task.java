package Task;
public class Task {
    private int id;
    private String description;
    private boolean completed;

    public Task(int id, String description) {
        this.id = id;                               // ID setzen
        this.description = description;             // Beschreibung setzen
        this.completed = false;                     // Standardmäßig auf "nicht erledigt" setzen
    }

    public int getId() {
        return id;                                  // ID zurückgeben
    }

    public String getDescription() {
        return description;                         // Beschreibung zurückgeben
    }

    public boolean isCompleted() {
        return completed;                           // Erledigungsstatus zurückgeben
    }

    public void setCompleted(boolean completed) {
        this.completed = true;                      // Erledigungsstatus setzen
    }
}