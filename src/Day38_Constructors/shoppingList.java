package Day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class shoppingList {
    public static void main(String[] args) {
    //Item item=new Item();
        //Item item1=new Item(2.3);
        Item item1=new Item(" toilet paper ",25,100);
        Item item2=new Item("domates",3,4);
        Item item3=new Item("biber",6,5);
        Item item4=new Item("patlican",5,3);
        Item item5=new Item("nane",4,3);


        ArrayList<Item>shoppingList=new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4,item5));//bulk operation

        double totalCost=0;
        //solution1
        /*
        for (Item each:shoppingList) {
            totalCost += each.calCost();
        }
        */
         for (int i=0;i<shoppingList.size();i++){
             totalCost+=shoppingList.get(i).calCost();
         }

        System.out.println("total:"+totalCost);





    }
}
