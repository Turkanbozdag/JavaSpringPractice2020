package Day17_WhileLoop;

import java.util.Scanner;

public class WhileLoopPractic {
    public static void main(String[] args) {
        /*ask the user to enter yes or no.
        if the user enters other than yes or no,repeat the previous step

         */
        Scanner input =new Scanner(System.in);
        System.out.println("enter yes or no");
        String word= input.next();
        boolean valid=word.equalsIgnoreCase("yes")||word.equalsIgnoreCase("no");
        if (word.equals("yes")){
            System.out.println("entered yes");
        }
        if (word.equalsIgnoreCase("no"));
        System.out.println("enterd no");






    }
}
