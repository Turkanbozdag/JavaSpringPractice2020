package calis;

import java.util.ArrayList;

public class SpecialExtraction {
    public static void main(String[] args) {
        String str="ABCD123$%#@&456EFG";
        char[]arr=str.toCharArray();
        ArrayList<Character>letters=new ArrayList<>();//isLetter()
        ArrayList<Character>digits=new ArrayList<>();
        ArrayList<Character> specialChars=new ArrayList<>();
        for (char each:arr){
            if (Character.isLetter(each)){// each letterin icine koymaya calisyo
                letters.add(each);
        }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChars.add(each);

            }





    }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);




}
    }