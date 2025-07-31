package parser;

import core.TaskManager;

public class AppContext {
    private TaskManager taskManager;

    public AppContext(TaskManager taskManager){
        this.taskManager = taskManager;
    }

    public TaskManager getTaskManager(){
        return taskManager;
    }
}
