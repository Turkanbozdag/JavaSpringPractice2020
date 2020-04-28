package Day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        ArrayList<String>shoppingList=new ArrayList<>();
        shoppingList.add("milk");
        shoppingList.add("coffe");
        shoppingList.add("bread");
        shoppingList.add("toilet paper");
        System.out.println(shoppingList);
        System.out.println(shoppingList.get(1));
        for(int i=0;i<4;i++){

            System.out.println(shoppingList.get(i));
            for (int a=0;i<shoppingList.size();a++){
                System.out.println(a);
            }
        }



    }
}
