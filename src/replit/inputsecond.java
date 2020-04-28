package replit;

import java.util.Scanner;

public class inputsecond {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int inseconds=20394;
        int minutes=inseconds%60;
        int hours=minutes/60;
        int second=inseconds-(minutes*60);
        System.out.println("Enter Seconds:");
    /*
        int inseconds=input.nextInt();

        input.nextLine();

        System.out.println("hours:");
        long hours =input.nextLong();

        input.nextLine();

        System.out.println("minutes:");
        int minutes=input.nextInt();

        System.out.println("seconds:");
        int second=input.nextInt();

        System.out.println("Time is:"+hours+","+minutes+","+second);

*/






    }
}
