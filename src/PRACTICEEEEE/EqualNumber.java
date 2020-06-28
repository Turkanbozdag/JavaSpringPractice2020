package PRACTICEEEEE;

import java.util.jar.JarOutputStream;

/*
write a program that can check the equality of the three given numbers declare 3numbers n1,n2,n3
 */
public class EqualNumber {
    public static void main(String[] args) {
        double n1=100.5;
        double n2=300.5;
        double n3=300.5;

        boolean n1Equaln2=n1==n2 && n1!=n3;//if n1 equal to n2 and equal n3,that makes n1 eqal n2 only
        boolean n1equaln3=n1==n3 && n1!=n2;//only n1 and n3 are equal
        boolean n2Equaln3=n2==n3 && n2!=n1;//onlyn1==n3
        boolean allequal=n1==n2 && n1==n3;//all of them equal

        boolean noneOfThemEqual=n1!=n2 && n1!=n3 && n2!=n3;
       // boolean noneEqual=n1Equaln2==false && n1equaln3==false && n2Equaln3==false;
       // boolean noneEqual2=!n1Equaln2 && !n1equaln3 && !n2Equaln3;//nonof them
        if (n1Equaln2){
            System.out.println("n1 is equal to n2");
        }
        if (n1equaln3){
            System.out.println("n1 is equal n3");
        }
        if (n2Equaln3){
            System.out.println("n2 is equal to n3");

        }
        if (allequal){
            System.out.println("n1 is equal to n2 and n3");
        }
        if (noneOfThemEqual){
            System.out.println("none of them equal");
        }












    }
}
