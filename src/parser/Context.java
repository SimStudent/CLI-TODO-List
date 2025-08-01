package parser;

import java.util.List;

import core.TaskManager;


//  This is the interface you should be follow to make the variable transmit well.
public interface Context {
    
    TaskManager getTaskManager();
    List<Command> getCommandList();

    // @Override 
    // String toString();  // toString methods should be ?
    
}
