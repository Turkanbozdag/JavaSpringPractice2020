package calis;

public class maxxx {
    public static void main(String[] args) {
        double a=100.5;
        double b=200.5;
        double c=300.5;
        boolean agreater=a>b && a>c;
        boolean bgreater=b>a&& b>c;
        //boolean bgreater2=b>a||b>c;
        boolean cgreater=c>a && c>b;
        if (agreater) {
            System.out.println(a + "is greater");
        }
        if (bgreater) {
            System.out.println(b + "");
        }
        if(cgreater) {

            System.out.println(c + "");
        }



    }
}
