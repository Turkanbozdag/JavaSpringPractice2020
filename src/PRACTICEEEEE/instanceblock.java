package PRACTICEEEEE;

public class instanceblock {

    static{
        System.out.println("static block");
    }
    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        instanceblock obj=new instanceblock();
        instanceblock obj2=new instanceblock();
    }





}
