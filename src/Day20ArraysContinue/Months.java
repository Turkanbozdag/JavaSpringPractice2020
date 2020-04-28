package Day20ArraysContinue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months={"jan","feb","marc","April","May","jun","jul","Agus","sep","oct","nov","Dec"};
        /*
        string[month2=new string[12];
        months2[0]="jan";         */

        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num=input.nextInt();//if user 18 while ne olur?
        int attempts=0;//


        while (num>12||num<=0){//while loop hep calistirdigi icin if degisiyoz burda while yaz
            System.out.println("invalid entry");
            System.out.println("please re-enter the number");
            num=input.nextInt();
            System.exit(0);
        }

        String result =months[num-1];
        System.out.println(result);




    }
}
