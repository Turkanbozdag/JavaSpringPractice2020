package Day38_Constructors;

public class TEST {

    public TEST(){
        System.out.println("constructor");

    }
    static {
        System.out.println("static block");//firs execu
    }
    {
        System.out.println("instance block");
    }

    public static void main(String[] args) {
        System.out.println("hello");
        new TEST();//instance, constructor
       // new TEST();//instance,contructor
    }





}
