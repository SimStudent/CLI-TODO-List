package core;

import java.util.List;

import model.Task;

public class TaskManager{
    private List<Task> tasks;  
    public boolean addTask(Task t){
        return tasks.add(t);
    }
    public Task deleteTask(int id){
        return tasks.remove(id);
    }

    public List<Task> getTasks(){
        return tasks;
    }
    // TODO There are still a lot of methods to do.

    @Override
    public String toString(){
        return "TaskManager{" +
               "tasks=" + tasks +
               '}';
    }
}
