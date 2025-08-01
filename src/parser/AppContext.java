package parser;

import java.util.List;

import core.TaskManager;

public class AppContext implements Context {
    private TaskManager taskManager;
    private List<Command> commandList;

    public AppContext(){}

    public AppContext(TaskManager taskManager,List<Command> commandList){
        this.taskManager = taskManager;
        this.commandList = commandList;
    }

    public void setTaskManager(TaskManager t){
        taskManager = t;
    }

    public void setCommandList(List<Command> c){
        commandList = c;
    }

    public TaskManager getTaskManager(){
        return taskManager;
    }

    public List<Command> getCommandList(){
        return commandList;
    }
}
