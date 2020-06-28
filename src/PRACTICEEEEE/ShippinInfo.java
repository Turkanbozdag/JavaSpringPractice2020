package PRACTICEEEEE;

import java.util.Scanner;

public class ShippinInfo{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your building number");
        String buildingNum=input.next();

       input.nextLine();
        System.out.println("enter your street adress");
        String streetAdress=input.nextLine();

        System.out.println("enter your city name");
        String cityName=input.next();

        System.out.println("enter your state");
        String stateName=input.next();

        System.out.println("enter your zip code");
        String zipcode=input.next();

        input.nextLine();

        System.out.println("enter your full name");
        String fullname=input.nextLine();

        String result="Ship to:"+fullname+"\n"+buildingNum+" "+streetAdress+"\n"+cityName+", "+stateName+" "+zipcode;
        System.out.println(result);

    }
}
