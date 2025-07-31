package parser;

public class ListCommand implements Command {

    @Override
    public String getName() {
        return "list";
    }

    @Override
    public String getDescription() {
        return "List the todo elements";
    }

    @Override
    public void execute(String[] args,AppContext context) {
        // TODO Finish the method.
    }
    
}
