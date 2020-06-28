package DaylyPractice;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {
        Queue<String>q=new PriorityQueue<>();//first in first o FIFO
        q.add("Domates");
        q.add("biber");
        q.add("Patlican");
        q.add("tirsik");

        System.out.println(q);

        String str=q.poll();//domates
        System.out.println(str);

        System.out.println(q);


    }





}
