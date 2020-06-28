package Day38_Constructors;


import java.text.DecimalFormat;
import java.util.Scanner;

public class circleObject {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the radius of th circle");
        double r=scan.nextDouble();

        circle circle1=new circle(r);
        double areaOfcircle=circle1.area();
        System.out.println("diameter is"+circle1.diameter);
        System.out.println("perimeter is:"+circle1.perimeter());
        System.out.println("Area is: "+df.format(areaOfcircle));


    }




}
