package day06;

public class SingleIfstatement {
    public static void main(String[] args) {


        boolean coldWeather=true;
        if (coldWeather){
            System.out.println("war your hat");//true ise yazdik bunlari iki cumleyi.
            System.out.println("wear your jacket");//bunuda the cod only get executed
        }
        boolean coronadetected=false;// false da calismiyo, truede excuded
        // true executed if the condition is true
        if (coronadetected){
            System.out.println("buy more toilet papers");

            System.out.println("buy more water");
            System.out.println("stay home");
            System.out.println("do more java coding");
        }


        System.out.println("====================");
        int a=101;
        boolean evenNumber=a%2==0;// if number can be devided by 2 without the reminad
        boolean oddNumber=a%2!=0;
        if (evenNumber){
            System.out.println(a +"is even number");
        }
        if (oddNumber){
            System.out.println(a+"  is odd number");
        }


        //if (!evennumber) verebilirsin if not even then must be odd der iki satiri yazmak zorunda degilsin











    }




}
