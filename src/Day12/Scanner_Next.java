package Day12;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String str=scan.next();//nex den dolayi string only first word aliyo yapiyoz

        System.out.println("cybertek school");//cyberteki alir next ten dolayi hepsini yazmiyo

        //7921 jones branch dr,mclean va,22034
        String fulladress="";

        System.out.println("enter the number of the building:");
        short bnumber=scan.nextShort();

        fulladress+=bnumber+"";//fulladres=fulladress+bnumber+""
        System.out.println("enter the street name:");
        String streetname=scan.next();
        fulladress+=streetname+"";

        System.out.println("enter the type of road");
        String roadtype=scan.next();
        fulladress+=roadtype+"";


        System.out.println("enter city name,state,zipcode");
        String cityname=scan.next();
        fulladress+=cityname+"";

        String state=scan.next();
        fulladress+=state+",";
        int zipcode=scan.nextInt();
        fulladress+=zipcode;
        System.out.println(fulladress);











    }
}
