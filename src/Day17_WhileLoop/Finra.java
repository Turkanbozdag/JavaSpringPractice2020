package Day17_WhileLoop;
/*
. write a program which prints out the numbers from 1 to 30:
			1. for numbers which are divisible by 3, print "FIN" instead of the number.
			2. for numbers which are divisible by 5, print "RA" instead of the number
			3. for numbers which are a divisible by both 3 and 5, print "FFINRA" instead of the number		Ex:
			1 2 FIN 4 RA FIND .... FINDRA




 */
import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {
        String result="";//bunu sonra ekledik tek bir seyde sonucu cikarmak icin
        for (int i=1; i<=30;i++){
            //System.out.println(i);
            result +="finra";
            if (i%3==0 && i%5==0){//prints the numbers that are divisible by both 3$5
                //System.out.println("finra");
                result="ra";
            }else if(i %3==0){//only divisible 3

                //System.out.println("Fin");
                result="fin";

            }else if (i%5==0){//divisible by 5
                System.out.println("ra");
            }else{//print the number tahat are not divisible by either 3 or 5
               // System.out.println(i);
                result +=i+"";//concenation
            }
        }
        System.out.println(result);




    }
}
