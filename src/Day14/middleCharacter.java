package Day14;
/* Write a Java method to display the middle character of a string

        a) If the length of the string is even there will be two middle characters.

        b) If the length of the string is odd there will be one middle character.

                Input :

                    elephant

                Output:

                    The middle character in the string: ph
 */
import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word");
        String word=input.next();//bananas
                                   // 0123456

        String middleCharacter="";//to store the middle caharcters at the end
        int totalchar=word.length();
        int middlenumber=totalchar/2;//7/2=3

        if (totalchar%2!=0) {//odd number
            middleCharacter = middleCharacter + word.charAt(middlenumber);

        }else {//even number
            middleCharacter = middleCharacter + word.charAt(middlenumber - 1) + word.charAt(middlenumber);
        }
        System.out.println(middlenumber);




















    }












}
