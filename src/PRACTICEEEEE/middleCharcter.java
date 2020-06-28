package PRACTICEEEEE;

import java.util.Scanner;

public class middleCharcter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your word");
        String word=input.next();//abdullahmesut

        String middlecharacter=" ";//to store the middle character at the end
         int totalchars=word.length();//12
        int middlenumber=totalchars/2;//12/2
       // System.out.println(totalchars);
        if (totalchars %2!=0){
            middlecharacter +=word.charAt(middlenumber);
        }else{//evenumber
           //
            // middlecharacter=middlecharacter+word.charAt(middlenumber-1)+word.charAt(middlenumber);
            middlecharacter +=word.charAt(middlenumber-1)+""+word.charAt(middlenumber);
        }
        System.out.println(middlecharacter);






    }
}
