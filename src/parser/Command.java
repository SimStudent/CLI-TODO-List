package parser;

public interface Command {
    String getName();
    String getDescription();
    void execute(String args[],AppContext context);
}
