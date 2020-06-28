package startContructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
       // Item item1=new Item();
       Item item1 =new Item("toilet paper: ",25,100);
       Item item2=new Item("elme:",5,12);
       Item item3=new Item("portakal",12,3);


        ArrayList<Item>shoppingList=new ArrayList<>();
        shoppingList.addAll(Arrays.asList(item1,item2,item3));
        double totalCost=0;
        for (Item each:shoppingList){
            totalCost +=each.calcost();

        }
        System.out.println("total:"+totalCost);

    }




}
