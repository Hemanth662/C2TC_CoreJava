package QueueDemo;

import java.util.*;
import java.io.*;
    
public class PriorityQueue {
    
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<3;i++){
            pq.add(i);
            pq.add(1);
        }
        System.out.println(pq);
    }
}  
