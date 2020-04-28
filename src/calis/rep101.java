package calis;

import java.util.Scanner;

public class rep101 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String firstandlastletter="";
        for(String eachword:words){
            firstandlastletter=eachword.substring(0,1)+eachword.substring(eachword.length()-1);
            System.out.println(firstandlastletter);

        }
       // for(int i=0;i< words.length;i++){
           // String eachword=words[i];

       // }


    }
}
