package Codiiiin;

import javax.swing.*;
import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[]nums={1,2,3,4};
        for (int eachelement:nums){
            System.out.println(eachelement);

        }
        String[]students={"muhtar","Asiya","Kuzzat"};
        for (String eachStudent:students){
            System.out.println(eachStudent);
        }
        int []arr1={10,9,8,7,4,5,6,7,3,2,1};
        for (int eachnumber:arr1){
            if (eachnumber<5){
                continue;
            }
            System.out.println(eachnumber);
        }
        System.out.println("===========================");
        String sentence="I like java";//java like I
        String []word=sentence.split(" ");
       // System.out.println(Arrays.toString(word));
        for (String eachword:word){
            System.out.println(eachword);
        }
        System.out.println("============================");
        for (int i=word.length-1;i>=0;i--){
            System.out.println(word[i]);
        }


    }
}
