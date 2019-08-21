package behavioral.command;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CommandQueue {

    private static BlockingQueue<Command> queue = new ArrayBlockingQueue<>(11,true);

    public static void addCommand(Command command){
        queue.offer(command);
    }

    public static Command peekCommand(){
        return queue.peek();
    }
}
