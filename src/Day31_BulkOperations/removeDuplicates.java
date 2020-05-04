package Day31_BulkOperations;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3));
        ArrayList<Integer> result = new ArrayList<>();//1 2

        for (Integer each : list) {//each 1,1,2,2,3,3
            if (!result.contains(each)) {
                result.add(each);
            }
        }

        System.out.println(result);
        System.out.println("========");
        /*
        write a program that can remove duplicates from an array of integer
        do not use each
         */
        Integer[] arr1 = {1, 1, 2, 2, 3, 3};
        ArrayList<Integer> nonduplicates = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!result.contains(arr1[i])) {
                nonduplicates.add(arr1[i]);
            }
        }
        System.out.println(nonduplicates);

    }

}




