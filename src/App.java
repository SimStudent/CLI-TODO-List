import model.*;
import core.*;
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
        CommandParser c = new CommandParser(m);
        // TaskDataGenerator.test();

        // You should be add the command to the parser so that it can find your command.
        c.add(new HelpCommand());
        c.add(new ListCommand());
        
        c.parse(args);


    }
}
