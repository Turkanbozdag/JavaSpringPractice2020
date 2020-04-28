package Day13;

import javafx.animation.ScaleTransition;
import sun.text.resources.cldr.ig.FormatData_ig;

public class StringLiteral {
    public static void main(String[] args) {
        String str1="cat";//string pool gider
        String str2=new String("cat");//  java heapcreative with new yazarak
        System.out.println(str1+":"+str2);
        System.out.println(str1==str2);//two different object,false

        String str3="cat";//string pool
        System.out.println(str1==str3);
        String str4 =new String("cat");
        String s1="java";//string pool ,immutable we cannot modify it.no change
        s1="javascript";
        System.out.println();//print javascript

        String s2="java";//no new object will be created in the memory
        System.out.println(s1==s2);//s1 present javascript s2 present java













    }
}
