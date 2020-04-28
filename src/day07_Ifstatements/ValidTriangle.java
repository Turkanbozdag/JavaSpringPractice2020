package day07_Ifstatements;

public class ValidTriangle {


    public static void main(String[] args) {

        short angle1 = 30;
        short angle2 = 50;
        short angle3 = 60;
        int sumofAngles = angle1 + angle2 + angle3;

        boolean validTraingle = sumofAngles == 180;
        if (validTraingle) {
            System.out.println("The shape is a triangle");
        }
        if (!validTraingle) {
            System.out.println("The shape is not a triangle");
        }


    }
     }


