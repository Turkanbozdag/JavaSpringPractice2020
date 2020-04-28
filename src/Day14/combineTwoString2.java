package Day14;

import java.util.Scanner;

/* Ask user to enter two words. Print first word without its first character then print the second word without its first character.

            Input:

                apple

                banana

            Output:

                ppleanana
 */
public class combineTwoString2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first word");
        String word1=input.next();//apple


        word1=word1.substring(1);//pple


        System.out.println("enter second word");
        String word2=input.next();//banana

        word2=word2.substring(1);//anana

        String result1=word1+word2;
        System.out.println(result1);








    }





}
