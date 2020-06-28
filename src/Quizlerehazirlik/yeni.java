package Quizlerehazirlik;

public class yeni {

    public yeni(){
        System.out.println("constructor");
    }
    {
        System.out.println("instance block");
    }
    public static void main(String[]args){
        new yeni();
        new yeni();
    }
    static {
        System.out.println("staticmethod");
    }






}
