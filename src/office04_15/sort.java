package office04_15;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        String str1="ABC";
        String str2="BAC";

        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();

        //Arrays.sort(ch1);
        //Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("==============");
        String sentence="I like to learn java java ,java";
        String[]words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int totalwords=words.length;
        System.out.println(totalwords);
        String result="";
        for (int i=words.length-1;i>=0;i--){
           // System.out.print(words[i]+" ");
            result+=words[i]+" ";
        }
        System.out.println(result.trim());






    }
}
