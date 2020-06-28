package Day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObject {
    /* create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer            2. write a program that can only retain the offers if:
                    1. the offer is for fulltime position
                    2. offer is from your local area
                    3. salary is greater than 100K

     */
    public static void main(String[] args) {
        Offer offer1=new Offer();
        offer1.setInfo("Va","BOA",1250000,true);//output

        Offer offer2=new Offer();
        offer2.setInfo("Ky","Capitalone",90000,false);
        //System.out.println(offer2);
        //System.out.println(offer1);
        Offer offer3=new Offer();
        offer3.setInfo("ly","Mc",120000,true);

        Offer offer4=new Offer();
        offer4.setInfo("BayArea","Google",140000,false);
        System.out.println("+++++++++++++++++++++++++++++++++");

        Offer[]offers={offer1,offer2,offer3,offer4};

        String myLocation="VA";//my current state
        ArrayList<Offer>Accept=new ArrayList<>(Arrays.asList(offers));
        //Accept.remoIf(turkan->turkan.salary<10000);
        //Accet.removeIf(turkan->turkan.isFulllTime==false);
        //Accept.removeIf(turkan->!turkan.location.equals(myLocation));

        Accept.removeIf(turkan->turkan.salary<100000 || turkan.isFulTime==false ||!turkan.location.equals(myLocation));// we remove the offer if its less than 100k or false
        System.out.println(Accept.size());

        for (Offer eachOffer:Accept){
            System.out.println(eachOffer);
        }







    }
}
