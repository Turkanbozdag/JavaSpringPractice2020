package calis;
import java.util.Arrays;
public class util {
    public static void main(String[] args) {


            int []arr={1,2,3};
            String r=Arrays.toString(arr);
        System.out.println(r);
        System.out.println(arr);

        String[]words={"hello","why","by","apple","note"};
        String firstandlastletter="hello";
        for(String eachword:words){
            firstandlastletter=eachword.substring(0,1)+eachword.substring(eachword.length()-1);
            System.out.println(firstandlastletter);
        }




    }
}
