package Task;

/**
 * Repräsentiert eine Aufgabe mit einer ID, Beschreibung und Fertigstellungsstatus.
 */
public class Task {
    private int id;
    private String description;
    private boolean completed;

    /**
     * Konstruiert eine neue Aufgabe mit der angegebenen ID und Beschreibung.
     * Die Aufgabe ist anfangs nicht abgeschlossen.
     *
     * @param id die eindeutige Kennung für diese Aufgabe
     * @param description eine Beschreibung der Aufgabe
     */
    public Task(int id, String description) {
        this.id = id; 
        this.description = description;
        this.completed = false;
    }

    /**
     * Gibt die ID dieser Aufgabe zurück.
     *
     * @return die ID dieser Aufgabe
     */
    public int getId() {
        return id;
    }

    /**
     * Gibt die Beschreibung dieser Aufgabe zurück.
     *
     * @return die Beschreibung dieser Aufgabe
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gibt zurück, ob diese Aufgabe abgeschlossen ist.
     *
     * @return true, wenn diese Aufgabe abgeschlossen ist, andernfalls false
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Setzt den Fertigstellungsstatus dieser Aufgabe auf true.
     *
     * @param completed der neue Fertigstellungsstatus (ignoriert, setzt immer auf true)
     */
    public void setCompleted(boolean completed) {
        this.completed = true; 
    }
}