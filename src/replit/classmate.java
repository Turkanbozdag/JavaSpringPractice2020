package replit;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class classmate {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);


            System.out.println("Enter command:");
            char response = scan.next().charAt(0);
            //WRITE YOUR CODE HERE switch(response){
            switch (response) {
                case 1:
                    System.out.println("Your request is being processed");
                    break;
                case 2:
                    System.out.println("Thank you anyway for your consideration");
                    break;
                case 3:
                    System.out.println("Sorry, no help is currently available");
                    break;
                default:
                    System.out.println("Invalid entry, please try again!");
            }
            /*
            System.out.println("enter firs word");
            String word1 = scan.next();
            System.out.println("enter second word");
            String word2 = scan.next();

            String result = "word1.cancat(word2).concat(word2).concat(word1)";
            System.out.println(result);
            System.out.println("===============");

            String sentence = "I like Java";
            String A = sentence.substring(7, sentence.length());
            String AA = sentence.substring(2, 6);
            System.out.println(A);
            System.out.println(AA);

            String sentence2="I like to learn java";
                String r1=sentence2.substring(10);

            System.out.println(r1);
            String r2="java";
            String r3=r2.substring(0,2);
            String r4=r2.substring(2,3);
            r4=r4.toUpperCase();
            String r5=r2.substring(3);

            String resultt=r3+r4+r5;
            System.out.println(resultt);
            */
            String str="I like  C#,C# is cool";
            str=str.replace("C#","java");

            System.out.println(str);
            String t1="I like world,ahmet like me";
            t1=t1.replace("world","ahmet");
            System.out.println(t1);









































































































































































































































































































































































        }
}
