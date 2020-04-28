package Day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {
    /* write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
Collapse



:upside_down_face:
2
:muscle:
1
:ghost:
1
:+1:
4
:v:
2
:man-facepalming:
1
:heavy_check_mark:
2
:male_vampire:
1
 */
    public static void main(String[] args) {
        String[]arr1={"A","B","C"};
        String[]arr2={"D","E","F","G"};
        ArrayList<String>List=new ArrayList<>();//{"A","B","D","E","F","G"}

        for (int i=0;i<arr1.length;i++){
            String eachElement=arr1[i];
            List.add(arr1[i]);//or List.add(eachElement);
        }
        for(String eachElement:arr2){
            List.add(eachElement);

        }
        System.out.println(List);



    }
}
