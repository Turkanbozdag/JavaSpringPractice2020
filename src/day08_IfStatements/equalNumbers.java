package day08_IfStatements;

public class equalNumbers {
    public static void main(String[] args) {
        /*
 write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal*/

        double n1=100.5;
        double n2=100.5;
        double n3=100.5;
        boolean n1equaln2=n1==n2&&n1!=n3;// if n1 equal to n2 and does equal n3,that makes n1equal n2
        boolean n1equaln3=n1==n3 && n1!=n2;//only n1 are n3 equal
        boolean n2equaln3=n2==n3 && n1==n3;
        boolean allequal=n1==n2 && n1==n3;//all of them are equal
        boolean noneOfthemequal=n1!=n2 && n1!=n3 && n2!=n3;//none of them are equal
        boolean noneequal= n1equaln2==false&& n1equaln3==false && n2equaln3==false;// or alttaki gibi bircok yoldan yazabbilirsin.
        boolean noneOfequal= n1equaln2==false&& n1equaln3==false && n2equaln3==false;

        if (n1equaln2){
            System.out.println(n1+"is equal to"+n2);// sdece n1 =ne de yazariz ciktidakolay okunumasi icin
        }
        if (n1equaln3){
            System.out.println(n1+ "is equal to "+n3);//n1 equla ne icindekini okunacak durumda yaz.

        }
        if (allequal){
            System.out.println(  n1+"is equal to "+n2+ " and"+n3 );
        }
        if (noneOfthemequal){
            System.out.println("none of them are equal");
        }











    }










}
