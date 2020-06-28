package Quizlerehazirlik;

public class gecegece {


    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        gecegece obj=new gecegece();
        gecegece obj2=new gecegece();
    }


    static{
        System.out.println("statick block");
    }



}
