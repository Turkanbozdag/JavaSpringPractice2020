package PRACTICEEEEE;

import java.util.Scanner;

public class oneTwoOne {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter first word");
        String word1=input.next();

        System.out.println("enter second word");
        String word2=input.next();

        String result=word1.concat(" "+word2).concat(" "+word2).concat(word1);
        System.out.println(result);







    }
}
