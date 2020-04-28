package office04_15;

import java.util.Arrays;

public class Arraysutility {
    public static void main(String[] args) {
        int[]arr={9,10,8,65,8,6,5};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);//[5,6,8,8,9,10,65
        System.out.println(Arrays.toString(arr));

        int[]salaries={9,8,10,2,3,4,5,6};
        Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries));
        System.out.println("minimum salary:"+salaries[0]);
        System.out.println("maximum salary:"+salaries[salaries.length-1]);








    }
}
