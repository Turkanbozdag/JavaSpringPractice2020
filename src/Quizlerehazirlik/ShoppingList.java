package Quizlerehazirlik;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
       //Item item1=new Item();
       // Item item1=new Item(2.5)
        Item item1=new Item("cucumber",2,5);
        Item item2=new Item("appl",3,6);
        Item item3=new Item("orange",3,5);
        Item item4=new Item("bananas",2,6);

        ArrayList<Item>shoppingList=new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3,item4));
        double totalCost=0;
        for (Item each:shoppingList){
            totalCost +=each.calCost();
        }
        for(int i=0;i<shoppingList.size();i++){
            totalCost+=shoppingList.get(i).calCost();
        }
        System.out.println("total:"+totalCost);




        //System.out.println(item1.calCost());

       // System.out.println(item1);





    }




}
