package Day24_method;

import java.util.Arrays;

public class tasksFromYesterday {
    /*
    AccessModifier specifier return-type methodname(paramter)
    . creata a function that can print the maximum number from any given array	5. creata a function that can print the minimum number from any given array	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1] */
    public static void MaxNumber(int[]array) {
        Arrays.sort(array);//ascending order
        System.out.println(array[array.length-1]);
        /*
        public static void MinNumber(int[]arr){
            Arrays.sort(array);//ascending order
            System.out.println("minimum number is:"+array[0]);
        }

    }

    public static void main(String[] args) {
        int[]arr={10,8,9,5,4,3,2,1};
        MaxNumber(arr);//10, if parameter is array,the argument must be arry
        MinNumber(array);
        int[]arr2={100,20,30,40,40,-100};*/
    }

}
