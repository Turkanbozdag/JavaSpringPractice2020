package PRACTICEEEEE;

public class StaticBlock {

    public static void main(String[]args){
        System.out.println("hello Cyertek");
        method1();
    }
    static{
        System.out.println("Hello world");
    }
    public  static  void method1(){
        System.out.println("custom method");
    }
}
