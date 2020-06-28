package Quizlerehazirlik;

public class ConstructorCall2 {
    public ConstructorCall2(){
        //this();
        System.out.println("Default contructor");
    }
    public ConstructorCall2(int a){
        this();
        System.out.println("constructor with int argument");
    }
    public ConstructorCall2(String str){
        this(10);
       // this();
        System.out.println("String");

    }

    public static void main(String[] args) {
        ConstructorCall2 obj=new ConstructorCall2("hello");
    }
    public void method1(){

    }




}
