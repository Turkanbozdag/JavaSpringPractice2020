package replit;

import java.util.Scanner;

public class caffein {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter number of second");
        int number=input.nextInt();
        int second=number/60;
        int min=number/60;
        int min2=min/60;
        int hour=min/60;
        System.out.println(hour+"hour"+min2+"minute"+second+"second");






    }

}
