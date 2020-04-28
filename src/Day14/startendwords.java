package Day14;

import java.util.Scanner;

/* Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"
 */
public class startendwords {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter second word");
        String word1=input.next();

        System.out.println("enter second");
        String word2=input.next();

        int length1=word1.length();
        int length2=word2.length();

        if (length1==5 && length2==5){
            if (word1.charAt(length2-1)==word2.charAt(0)){
                System.out.println("fizz");
            }
        }else{
            System.out.println("buzz");
        }





    }
}
