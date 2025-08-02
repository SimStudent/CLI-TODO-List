package parser;

public interface Command {
    String getName();
    String getDescription();
    String getDetailHelp();

    void execute(String args[],AppContext context);
}
