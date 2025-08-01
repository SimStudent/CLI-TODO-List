package parser;

import java.util.*;

import core.TaskManager;

public class CommandParser {
    // TODO 改为泛型的格式
    // private TaskManager taskManager;

    // private AppContext context;  // context应该是一个过程式的组件 X forbid

    private List<Command> commandList;
    private TaskManager taskManager;
    private static String noneCommandto = "help";

    // public CommandParser(TaskManager m){
    //     taskManager = m;
    //     commandList = new ArrayList<Command>();
    // }

    public CommandParser(AppContext taskManagerContext){
        taskManager = taskManagerContext.getTaskManager();
        commandList = new ArrayList<Command>();
    }

    public void add(Command command){
        commandList.add(command);
    }

    @Override
    public String toString(){
        return commandList.toString();
    }

    public void parse(String[] args){
        if(args.length==0){
            for(Command command : commandList){
                // if(noneCommandto == command.getName())
                if(noneCommandto.equals(command.getName())){
                    command.execute(args,new AppContext(taskManager,commandList));
                    return;
                }
            }
            System.out.println("Usage: todo <command> [<args>]");
            return;
        }
        for(Command command : commandList){
            // if(args[0] == command.getName()){
            if(args[0].equals(command.getName())){
                command.execute(args,new AppContext(taskManager,commandList));
                return;   
            }
        }
        System.out.println("WARN  todo: '"+ args[0] +"' isn't a todo command. See 'todo help'.");
    }

}
