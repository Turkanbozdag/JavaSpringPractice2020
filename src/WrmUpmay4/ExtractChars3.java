package WrmUpmay4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ExtractChars3 {
    public static void main(String[] args) {
        String str="ABCD123$%#@&456EFG!";
        char[]arr=str.toCharArray();
        Character[]ch=new Character[arr.length];
        for (int i=0;i<arr.length;i++){
            ch[i]=arr[i];
        }
       // System.out.println(Arrays.toString(ch));

        ArrayList<Character> letters=new ArrayList<>(Arrays.asList(ch));
        letters.removeIf(p->!Character.isLetter(p));//letterler aldi
        System.out.println(letters);

        ArrayList<Character>digists=new ArrayList<>(Arrays.asList(ch));
        digists.removeIf(p->!Character.isDigit(p));
        System.out.println(digists);


        ArrayList<Character>specialChars=new ArrayList<>(Arrays.asList(ch));
        specialChars.removeAll(letters);
        specialChars.removeAll(digists);
        specialChars.removeIf(p->Character.isDigit(p)||Character.isLetter(p));










    }
}
