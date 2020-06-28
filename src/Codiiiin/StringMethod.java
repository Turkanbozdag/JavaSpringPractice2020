package Codiiiin;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name="java";//'J','a','v'
        char[]chars=name.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[3]);
      //  System.out.println(chars[4]);

        String str="I like java";
      String[]arr=  str.split(" ");
        System.out.println(Arrays.toString(arr));



        //reverse sentence:day great is today
        String sentence="Today is great day";
          String[]words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String result=" ";

        for (int i=words.length-1;i>=0;i--){
            String eachwords=words[i];
            result+=eachwords+" ";

        }
        System.out.print(result);

        String str2="ABCDE";
        String arr2[]=str2.split("");
char[]ch2=str2.toCharArray();

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));
int[]num1=new int[3];//[0,0,0]
int[]num2={1,2,3,4,5};//size:5
num1=num2;//num1={1,2,3,4,5}
        System.out.println(Arrays.toString(num1));


    }
}
