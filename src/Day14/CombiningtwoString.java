package Day14;

import java.util.Scanner;

/*
 Ask user to enter two words. Print the first word, second word, second word, first word

        Input:

        one

                two

        Output:

        onetwotwoone

        DO NOT USE + OPERATOR
 */
public class CombiningtwoString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first word");
        String word1=input.next();
        System.out.println("enter second");
        String word2=input.nextLine();
        String result=word1.concat(""+word2).concat(""+word2).concat(""+word1);




        System.out.println(result);














    }

}
