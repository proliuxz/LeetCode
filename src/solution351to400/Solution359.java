package solution351to400;

import java.util.HashMap;

/**
 * Created by Xinzhuo Liu on 11/27/2016.
 * Design a logger system that receive stream of messages along with its timestamps, each message should be printed if and only if it is not printed in the last 10 seconds.

 Given a message and a timestamp (in seconds granularity), return true if the message should be printed in the given timestamp, otherwise returns false.

 It is possible that several messages arrive roughly at the same time.

 Example:

 Logger logger = new Logger();

 // logging string "foo" at timestamp 1
 logger.shouldPrintMessage(1, "foo"); returns true;

 // logging string "bar" at timestamp 2
 logger.shouldPrintMessage(2,"bar"); returns true;

 // logging string "foo" at timestamp 3
 logger.shouldPrintMessage(3,"foo"); returns false;

 // logging string "bar" at timestamp 8
 logger.shouldPrintMessage(8,"bar"); returns false;

 // logging string "foo" at timestamp 10
 logger.shouldPrintMessage(10,"foo"); returns false;

 // logging string "foo" at timestamp 11
 logger.shouldPrintMessage(11,"foo"); returns true;
 */
public class Solution359 {
    /** Initialize your data structure here. */
    HashMap<String, Integer> logStore;
    public Solution359() {
        logStore  = new HashMap<>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(logStore.containsKey(message) == false)
        {
            return logData(message, timestamp);
        }
        else if(Math.abs(logStore.get(message)-timestamp)>=10)
        {
            return logData(message, timestamp);
        }
        else{
            return false;
        }
    }
    public boolean logData(String message,int timestamp) {
        logStore.put(message,timestamp);
        return true;
    }
}
