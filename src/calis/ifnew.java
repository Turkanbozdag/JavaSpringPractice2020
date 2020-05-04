package calis;

public class ifnew {

    public static void main(String[] args) {

        double angle1=30;
        double angle2=40;
        double angle3=80;
        short sumOfangles=(short)(angle1+angle2+angle3);
        if (sumOfangles==180){
            System.out.println("the shape is triangle");
        }
        if (sumOfangles!=180){
            System.out.println("The shape is not a valid Triangle");
        }

    }

}
