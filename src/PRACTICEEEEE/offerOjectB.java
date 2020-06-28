package PRACTICEEEEE;

import java.util.ArrayList;
import java.util.Arrays;

public class offerOjectB {
    public static void main(String[] args) {
        classoffer offer1=new classoffer();
        offer1.setInfo("VA","BOA",95000,true);
        System.out.println(offer1);

        classoffer offer2=new classoffer();
        offer2.setInfo("KY","capitalone",120000,false);
        System.out.println(offer2);


        classoffer offer3=new classoffer();
        offer3.setInfo("MD","chae",960000,true);
        System.out.println(offer3);

        classoffer offer4=new classoffer();
        offer4.setInfo("bayArea","google",115000,false);

        classoffer[]offers={offer1,offer2,offer3,offer4};

        String mylocation="VA";

        ArrayList<classoffer>Accept=new ArrayList<>(Arrays.asList());
        Accept.removeIf(each->each.salary<10000 || each.isfulltime||!each.location.equals(mylocation) );

        System.out.println(Accept.size());
        for (classoffer eachoffer:Accept){
            System.out.println(eachoffer);
        }






    }
}
