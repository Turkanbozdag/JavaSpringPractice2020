package calis;

import java.util.ArrayList;
import java.util.Arrays;

public class Stringleriayirma {
    public static void main(String[] args) {
        String str="ABCD123$%#@&456EFG";
        char[]arr=str.toCharArray();
         Character[]ch=new Character[arr.length];
         for (int i=0;i<arr.length;i++){
           ch[i]=arr[i];
        }
        //System.out.println(Arrays.toString(ch));
        ArrayList<Character>letters=new ArrayList<>(Arrays.asList(ch));
         letters.removeIf(p->!Character.isLetter(p));
        System.out.println(letters);


    }
}
