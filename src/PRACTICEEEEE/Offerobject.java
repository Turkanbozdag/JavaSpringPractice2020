package PRACTICEEEEE;

import java.util.ArrayList;

public class Offerobject {
    public static void main(String[] args) {
        offer offer1=new offer();
        offer1.setInfo("va","BOA",120000,true);
        System.out.println(offer1);

        offer offer2=new offer();
        offer2.setInfo("KYy","capitalone",13000,true);
        System.out.println(offer2);

        offer offer3=new offer();
        offer3.setInfo("MD","CVs",95000,true);

        offer offer4=new offer();
        offer4.setInfo("BayArea","google",11000,false);
        offer[]offers={offer1,offer2,offer3,offer4};
        String myLocation="va";

        ArrayList<offer>accept=new ArrayList<>();
        //accept.removeIf(each->each.salary<10000 || each.isfulltime==false|| !each.location.equals(myLocation));//we remove the offer if its less than100K
        accept.removeIf(p->p.salary<100000);
        System.out.println(accept.size());

       //
        for (offer eachoffer:accept){
            System.out.println(eachoffer);
        }





    }
}
