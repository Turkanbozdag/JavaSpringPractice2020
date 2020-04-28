package day07_Ifstatements;

public class If_Else_statements {
    public static void main(String[] args) {

int number=0;
if (number>=0){
    System.out.println(number +"is positive");

}
    if (number<0){
        System.out.println(number+" is negative");

    }
    if (number>=0){
        System.out.println(number+" is positive");
    }else{
        System.out.println(number+"negative");
    }






    int number1=100;
    if (number %2==0){
        System.out.println(number1 +"even");
    }
    if (number1%2!=0){
        System.out.println(number1+ "odd");

    }

    // ustteki ile alttaki ayni anlama geliyo else
        // allatki uste boolean evennum-number%2==0;yazilabilir.
    if (number1%2==0){
        System.out.println(number1+"even");
    }else{
        System.out.println(number1+"odd");
    }





    int age=30;
    if (age>=21){
        System.out.println("here is your milk:))");
    }else {
        System.out.println("go home baby");
    }
    boolean testedPositiveForcorona=true;
    if (testedPositiveForcorona){
        System.out.println(" wash your hans always");
    }else{
        System.out.println("come to work");
    }




    int grade=100;
    int t=60;
    int k=70;
    int g=90;
    boolean big=g>grade;
    boolean god=g>k;
    boolean pass =k>t;
    if (big) {
        System.out.println("exellent");
    }
    if (god){
        System.out.println("good");
    }
    if (pass){
        System.out.println("pass");
    }


int player=4;
    int house=4;
    int a=21;
    boolean score1=player>house;
    boolean score2=player<house;
    boolean score3=player==house;
    if (score1){
        System.out.println("wins");
    }
    if (score2){
        System.out.println("loses");

    }
    if (score3){
        System.out.println("donee");
    }
    int A=21;
    int h=10;
    int p=11;
    if(h>p);{
        System.out.println("los");
    }
        if (p==h){
            System.out.println("draw");

        }
        if (p>h){
            System.out.println("wins");
        }
        if (p+h>A){
            System.out.println("bust");
        }













    }






}
