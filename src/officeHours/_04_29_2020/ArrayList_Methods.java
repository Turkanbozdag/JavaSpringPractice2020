package officeHours._04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);//{10,20}
        list.add(1,30);//add the element give index
                //{10,30,20}
        System.out.println(list);
        System.out.println(list.size());

      int num1=  list.get(2);//integer 20,//unboxing
        byte a=100;
        //Integer b=a;
        Byte a2=100;
        int b2=a2;//unboxing

        ArrayList<String>list2=new ArrayList<>();
                        list2.add("A");
                        list2.add("B");
                        list2.add("c");
                        list2.add("D");

                        list2.add(2,"E");
        System.out.println(list2);
        for(int i=0;i<=list2.size()-1;i++){
            String str=list2.get(i);
            System.out.println(str);
        }
        System.out.println("==================");
        for(String each:list2){
            System.out.println(each);
        }







    }
}
