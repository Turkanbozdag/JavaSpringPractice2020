package PRACTICEEEEE;

import java.util.Scanner;

public class cicleObject {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the radius of the cicle");
        double r=scan.nextDouble();
        //double r=5.5;
        circle circle1=new circle(r);

        double areaofcicle=circle1.area();
        System.out.println(areaofcicle);
    }
}
