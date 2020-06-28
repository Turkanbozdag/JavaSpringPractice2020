package PRACTICEEEEE;

import Day12.Switch_practice;

public class Browser {
    public static void main(String[] args) {
        String Browsername="fireFox";
        switch(Browsername) {

            case " Chrome":
                System.out.println("chrome is opening");
                break;
            case "fireFox":
                break;
            case "firefox":
                System.out.println("firefox is opening...");
                break;
            case "safari":
                System.out.println("safari is opening");
                break;
            case "opera":
            default:

                System.out.println("invalid input");
        }

    }
}
