package day52_collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {
        Queue<String> q=new PriorityQueue<>();//first FIFO
        q.add("D");
        q.add("C");
        q.add("B");
        q.add("A");


        String str=q.poll();//A
        System.out.println(str);

        System.out.println(q);







    }




}
