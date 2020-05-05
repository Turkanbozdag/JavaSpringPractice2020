package calis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class mondayuniques {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 4, 5, 5));
        list.removeIf(p -> Collections.frequency(list, p) > 1);//after the step uniqe left
        System.out.println(list);

        System.out.println("==================");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 1, 2, 3, 4, 5, 5));
        list1.removeIf(p -> Collections.frequency(list1, p) == 1);//p is precati every single caracter icin//object uniques ise burdan sonra olmayacak
        System.out.println(list);
    }
}
