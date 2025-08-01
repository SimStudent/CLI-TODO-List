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
    public void execute(String[] args,AppContext context) {
        // TODO Finish the method.
        System.out.println("-- This is Help Panel--");
        List<Command> l = context.getCommandList();
        for(Command c: l){System.out.println(c.getName()+"    "+c.getDescription());}
    }

    
}
