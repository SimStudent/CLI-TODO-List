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
    public String getDetailHelp(){
        return """
               Usage: todo list [query]

               Lists all todos, or the tasks matching the supplied query.

               """;
    }

    @Override
    public void execute(String[] args,AppContext context) {
        // TODO Finish the method.
    }
    
}
