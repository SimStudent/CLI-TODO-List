package parser;

public class HelpCommand implements Command {

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescription() {
        return "Show help for a command";
    }

    @Override
    public void execute(String[] args) {
        // TODO Finish the method.
    }

    
}
