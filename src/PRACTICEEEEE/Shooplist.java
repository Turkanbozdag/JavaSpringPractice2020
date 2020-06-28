package PRACTICEEEEE;

import java.util.ArrayList;
import java.util.Arrays;

public class Shooplist {
    public static void main(String[] args) {
        Iteem item1=new Iteem("elma",25,100);
        System.out.println(item1.calcCost());
        System.out.println(item1);
        Iteem item2=new Iteem("armut",3,6);
        Iteem item3=new Iteem("patlican",2,3);
        Iteem item4=new Iteem("limon",1,2);
        Iteem item5=new Iteem("pecete",2,5);
        ArrayList<Iteem>shooplist=new ArrayList<>();
        shooplist.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        double totalcost=0;/*
        for (Iteem each:shooplist){
            totalcost +=each.calcCost();
        }

        */
        for (int i=0;i<shooplist.size();i++){
            totalcost+=shooplist.get(i).calcCost();
        }
        System.out.println("total:"+totalcost);







    }
}
