package Day32;

import sun.text.resources.CollationData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
       int max= Collections.max(list);
        System.out.println(max);
        int min=Collections.min(list);
        System.out.println(min);
        ArrayList<Integer>numbers= new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
        //second maximum number from ArrayList ex{1,1,,2,3,4,4}
        //second max=3 second min=2
        Collections.max(numbers);
        int secondMax=0;
        int secondMin=0;
        int secondmax= Collections.max(numbers);
        System.out.println(secondMax);










    }
}
