package officeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxAndMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=-2235767;//0
        int min=112332434;
        int i=1;
        while(i<=5){
       System.out.println("enter a number");//buralari 100 num deseydi 100 kezmi yazacaz?loop kullan onun icn
       int num=input.nextInt();//0 -5

       if (num>max){
           max=num;
       }
       if (num<min){
           min=num;
       }

       i++;

        }
        System.out.println("maximum number is:"+max);
        System.out.println("min number is:"+min);






    }
}
