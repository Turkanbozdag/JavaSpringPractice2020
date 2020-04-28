package day09_NestedIf_Ternary;

public class Ifstatement_withoutcurlyBraces {
    public static void main(String[] args) {

        int number=100;
        if (number %2==0)
            System.out.println("even number");// if i have one statement { kullanmaya biliriz same olsada olmasada.(single statementta)
        else
            System.out.println("odd number");

            if (true){
                System.out.println("hello");
                System.out.println("condition is true");
                System.out.println("test executed");//if the block conateing mora than one statement you must give{}
            }
        System.out.println("==============");

            if(9<8)
                System.out.println("hello");
                System.out.println("condition is true");
                System.out.println("test executed");


    }



}
