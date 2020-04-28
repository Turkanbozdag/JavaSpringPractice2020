package Day24_method;

public class BirthYear {

    public static void Age(short birthyear) {//ilk yazdigim
        int currentyear = 2020;
        int age = currentyear - birthyear;
        if (age > 0 && birthyear>1900) {
            System.out.println(age);
        } else {
            System.out.println("you are not born yet");
        }
    }
    public static void main(String[]args){
        //int a=2002;
       // Age((short)2002);
        printHelloCybertek();

    }
    public static void printCybertek(){

    }
    public static void printHello(){
        System.out.println("cybertek");
    }
    public static void printHelloCybertek(){}
  //  printHello();
    //printCybertek();
}
