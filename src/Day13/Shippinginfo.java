package Day13;
/*
 write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:			and prints the ship to info in the following format:			ex output:					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102

 */






import java.util.Scanner;

public class Shippinginfo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//enter burda kaldi
        System.out.println("Enter your building number");
        String building=input.next();//112A+enter var

        input.nextLine();//enter aldi simi scanner input ala bilir yeni bilgi girece

        System.out.println("Enter your street address");
        String streetaddress=input.nextLine();

        System.out.println("Enter your city name:");
        String cityname=input.nextLine();

        System.out.println("Enter your state");
        String statename=input.nextLine();

        System.out.println("Enter your zip code");
        String zipcode=input.next();

        input.nextLine();

        System.out.println("enter your full name:");
        String fullname=input.nextLine();
        String result="ship to: "+fullname+"\n\t\t"+building+streetaddress+"\n\t\t"+cityname+","+statename+" "+zipcode;

        System.out.println(result);








    }
}
