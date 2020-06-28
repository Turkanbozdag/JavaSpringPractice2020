package Day38_Constructors;

public class constructorcalls2 {
    public constructorcalls2(){
        System.out.println("default constructor");

    }
    public constructorcalls2(int a){
        this(); //default contructor
        System.out.println("constructor with int argument");

    }
    public constructorcalls2(String str){
        //System.out.println("hello");
        this(10);//default &int argument
        System.out.println("constructor with String argument");
    }

    public static void main(String[] args) {
        constructorcalls2 obj=new constructorcalls2("hello");
    }
    public void method1(){
        //constructorcalls2();
    }

    {

    }



}
