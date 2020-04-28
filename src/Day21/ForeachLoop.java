package Day21;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Arrays;
/*
for(dataatype variablename:arrayname)[
}
 */
public class ForeachLoop {
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        for (int eachElement:num){
            System.out.println(eachElement);
        }

        String []students={"muhtar","asiya","muhtar"};
        for (String eachStudent:students){
            System.out.println(eachStudent);
        }
        int[]arr1={1,2,3,4,5,6,7,8,9,10};

        for (int each:arr1){
            if (each<5){
                continue;
            }
            System.out.println(each);
        }
        System.out.println("========================");
        String sentence="I like Java";//java like l
        String []words=sentence.split("");
        for (String eachword:words){
            System.out.println(eachword);
        }





        }
    }

