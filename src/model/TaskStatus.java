
package model;

public enum TaskStatus{
    // TODO,
    // IN_PROGRESS,
    // DONE,
    // CANCELLED;    // It may just like some finished things.
    TODO("The things you may not done."),
    IN_PROGRESS("The doing things"),
    DONE("The things is done."),
    CANCELLED("The things is cancelled.");

    private final String description;

    TaskStatus(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}