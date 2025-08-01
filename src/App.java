import model.*;
import core.TaskManager;
import parser.AppContext;
import parser.CommandParser;
import parser.HelpCommand;
import parser.ListCommand;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println("arg: " + arg);
        }

        TaskManager m = new TaskManager();
        AppContext context = new AppContext();
        context.setTaskManager(m);
        CommandParser c = new CommandParser(context);
        // TaskDataGenerator.test();

        // You should be add the command to the parser so that it can find your command.
        c.add(new HelpCommand());
        c.add(new ListCommand());
        
        c.parse(args);


    }
}
