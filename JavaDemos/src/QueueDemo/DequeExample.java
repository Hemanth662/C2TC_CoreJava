package QueueDemo;

import java.util.*;
public class DequeExample {
    public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq
            = new ArrayDeque<String>();
 
        // add() method to insert
        dq.add("suresh");
        dq.addFirst("anil");
        dq.addLast("ajay");
 
        System.out.println(dq);
    }
}