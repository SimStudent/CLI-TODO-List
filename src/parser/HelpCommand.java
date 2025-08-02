package parser;

import java.util.List;

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
    public String getDetailHelp(){
        return "Usage: todo help <command>";
    }


    @Override
    public void execute(String[] args,AppContext context) {
        // TODO Finish the method.
        System.out.println("Usage: todo <command> [<args>]");
        System.out.println("\nAvailable commands are listed below.");
        System.out.println("\nType 'todo help <command>' to get more help for a specific command.");
        System.out.println("\nCommand    Summary");
        System.out.println("-------    -------");
        List<Command> l = context.getCommandList();
        for(Command c: l){System.out.println(c.getName()+"    "+c.getDescription());}
    }

    
}
