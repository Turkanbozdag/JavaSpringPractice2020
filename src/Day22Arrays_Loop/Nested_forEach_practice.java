package Day22Arrays_Loop;

import java.util.Arrays;

public class Nested_forEach_practice {
    public static void main(String[] args) {
        String str="java is fun";
        String[]arr=str.split(" ");
        System.out.println(Arrays.toString(arr));



        String sentence="today is great day";
        String[]words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
     for(int i=words.length-1; i>=0;i--){
         String eachwords=words[i];
         System.out.println(eachwords+"");
     }






    }
}
