package replit;

import java.util.ArrayList;

public class comb {
    /*combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])

returns "foo bar"



combineRs(["1","2","3"],[" 4"])

returns "1234"
     */
    public static void main(String[] args) {
        String[]arr1={"f","o","o"};
        String[]arr2={"b","a","r"};

        ArrayList<String>list=new ArrayList<>();
        for (int i=0;i<=arr1.length-1;i++){
            String eachElement=arr1[i];
            list.add(eachElement);

        }
        for (String eachElement:arr2){
            list.add(eachElement);
        }
        System.out.println(list);



        //System.out.println("1+1 = "+calc.plus(1,1) );
        //System.out.println("1-1 = "+calc.minus(1,1) );





    }
}
