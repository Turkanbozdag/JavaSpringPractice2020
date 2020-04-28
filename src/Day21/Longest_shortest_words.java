package Day21;

import java.io.Closeable;
import java.util.Arrays;

public class Longest_shortest_words {
    public static void main(String[] args) {
        String[] names={"reem","omer","muhtar","emrah","muhammmet","ana"};
        int maxLengthString=names[0].length();//4
        int minlenthString=names[0].length();
        String logestword=names[0];
        String shortestword=names[0];
        for (int i=0;i<names.length;i++){
            if (names[i].length()>maxLengthString){
                logestword=names[i];
            }
            if (names[i].length()>maxLengthString) {
                maxLengthString = names[i].length();
                logestword = names[i];
            }
            if (names[i].length()<minlenthString){
                minlenthString=names[i].length();
                shortestword=names[i];
            }
        }
        System.out.println(logestword);
        System.out.println(shortestword);


        String str="I like java";
        String[]arr=str.split("");
        System.out.println(Arrays.toString(arr));

        String str2="Abcd";
        String arr2[]=str2.split("");
        char[]ch2=str2.toCharArray();

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(ch2));



    }




}
