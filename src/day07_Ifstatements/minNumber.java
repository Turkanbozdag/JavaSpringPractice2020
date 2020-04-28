package day07_Ifstatements;

public class minNumber {
    public static void main(String[] args) {

 //     hat accepts three numbers and return the minimum number

        double a=100;
        double b=200;
        double c=400.5;
        boolean amin=a<b&& a<c;
        boolean bmin =b<a && b<c;
        boolean cmin=c<a && c<b;
        if (amin) {
            System.out.println(a + "is minimum number");
        }
            if(bmin){
                System.out.println(b+" is min");
        }
            if (cmin){
                System.out.println(c+"  is min");
            }





    }




}
