package Day24_method;

import Day15_ForLoop.Reverse;
import Day15_ForLoop.ReverseString;

public class methodprameters2 {
    //3..create a function that can reverse any string
    //"muhtar"===>rathum,"cybertek"===>ketrebyc
    public static void main(String[]args){
        String names="turkan";
        reverseString(names);

        String names2="cybertek school";
        reverseString(names2);
        System.out.println("hello");
    }
    public static void reverseString(String str){
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }





}
