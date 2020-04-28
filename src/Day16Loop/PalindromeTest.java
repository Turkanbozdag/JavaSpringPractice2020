package Day16Loop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter yoru words");
        String word=input.nextLine();//java
        String reversedword="";
        for (int i=word.length()-1; i>=0; i--){
             reversedword+=word.charAt(i);
        }       //level==>level
       // System.out.println(reversedword);
        boolean palindrome=word.equals(reversedword);
        System.out.println(palindrome);

    }
}
