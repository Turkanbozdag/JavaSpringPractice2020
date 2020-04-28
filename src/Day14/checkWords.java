package Day14;

import java.util.Scanner;

/* Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"

 */
public class checkWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first word");
        String word1=input.next();

        System.out.println("enter second word");
        String word2=input.next();

        System.out.println("enter third word");
        String word3=input.next();

        int length1=word1.length();
        int length2=word2.length();
        int length3=word3.length();

        boolean notsame=length1!=length2 && length2==length3;// none same
        if (length1==length2&& length2==length3){
            System.out.println("print all same");

        }else {
            System.out.println();
        }












    }
}
