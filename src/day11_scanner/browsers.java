package day11_scanner;

import com.sun.imageio.plugins.wbmp.WBMPImageReader;

/*
3. write a program that can display the selected browser
                        1. declear a String variable called browserName                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task

 */
public class browsers {

    public static void main(String[] args) {


    String browsername="chrome";

    switch (browsername){
       //case"chrome":break olursa dogrusunu yazarsan alt alda byazilir
        case"Chrome":
            System.out.println("chrome is openning...");
                break;
        case "firefox":
            System.out.println("firefox is opening...");
            break;
        case "safari":
            System.out.println("sfari is opening..");
            break;
        case "opera":
            System.out.println("opera is opening");
            break;
        default:
            System.out.println("invalid browsername");
    }






    }
}
