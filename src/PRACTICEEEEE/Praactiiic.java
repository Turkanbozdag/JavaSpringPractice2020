package PRACTICEEEEE;

import java.util.Scanner;

public class Praactiiic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your word");
        String word=input.nextLine();//java
        String reversedWord="";

        for (int i=word.length()-1;i>=0;i++){
            reversedWord +=word.charAt(i);

        }
        boolean palindrome=word.equals(reversedWord);
        System.out.println(palindrome);






    }
}
