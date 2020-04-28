package Day22Arrays_Loop;

import java.util.Arrays;

public class calisma {
    public static void main(String[] args) {
        String []students={"ali","mustafa","Ayse"};
        for (String eachstudent:students){
            System.out.println(eachstudent);
        }
        int[]arr1={1,2,3,4,5,6,7,8,9,10,11};
        for (int each:arr1) {
            if (each < 5) {
                continue;
            }

            System.out.println(each);


        }

        String sentence="Ilike java";
        String[]word=sentence.split("");
        for (String eachword:word){
            System.out.println(eachword);
        }
        for (int i=word.length-1;i>=0;i--){
            System.out.println(word[i]);

        }
        int[]arr={1,2,3};
        int[][]arr2D={{1,2,3},{4,5,6,7,8}};
        System.out.println(arr2D.length);
       int[]arr1D= arr2D[0];

        System.out.println(Arrays.toString(arr2D[0]));

        char[][]ch2D={ { 'A','B'},{'D','E','F'}};
        char c1=ch2D[1][0];
        System.out.println(c1);
        char[] c2=ch2D[2];
        System.out.println(Arrays.toString(c2));




    }
}
