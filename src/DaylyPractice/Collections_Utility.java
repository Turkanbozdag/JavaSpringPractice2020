package DaylyPractice;

import WrmUpmay4.LinkedHasSet;

import java.util.*;

public class Collections_Utility {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4));
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("==================================");
        //1.write a progrma th CAN REMOVE duplicates and print out in sorted order
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 4, 3, 2, 2, 1, 1, 1));

        new TreeSet<>(nums);//1,2,3,4,5,6,7
        nums = new ArrayList<>(new TreeSet<>(nums));



/*
        TreeSet<Integer>sorted=new TreeSet<>(nums);
        nums=new ArrayList<>(sorted);
        System.out.println(sorted);
        System.out.println(nums);




 */
        System.out.println("=============================================");
        //2.write a program that can remove the duplicates from an arraylist.Do not change the order
        //[6,6,6,6,6,6,5,5,5,4,4,4,4]===============>[6,5,4]
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 4));
        list = new ArrayList<>(new LinkedHashSet<>(list));//treeSet kullanirsak HasSet yerine sonuc [4,5,6]
        System.out.println(list);
        System.out.println("+============================================================================");
        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("A", "B", "B", "C", "D"));//akure one times if yes true no false
        Collections.frequency(letters, "A");


        boolean result = Collections.frequency(letters, "A") == 1;
        System.out.println(result);
        //1-write a program that can remove the duplicate characters from String
        //2-write program that can identif two if two are buil out of the same letters
        // ex:
        //str1="ababab"
        //str2="ab";output:true

        //public static void main(String[] args){
        /*
            String str = "ABABABCDEF";//["A","B",'D','F']
            String[] arr = str.split("");
            LinkedHashSet<String> ls=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(ls);
        //ABCDEF
        String result1="";
        for (String each:ls){
            result1 +=each;
        }
        System.out.println(result1);

        }


    }
    //}

         */
        System.out.println("+========================================================");
        String str="ABABABCDEF";//ABCDEF

        str="";
        for ( String each:new LinkedHashSet<>(Arrays.asList(str.split("")))){
            str+=each;
        }
        System.out.println(str);



    }
}