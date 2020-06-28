package Quizlerehazirlik;

public class ConstructorCall3 {
    public ConstructorCall3(){
        //this(9);
        System.out.println("default");
    }
    public ConstructorCall3(int a){
        //this(20);//constructor can not call myself
        System.out.println("int argument");
    }
    public void method1(){
        //this();
        System.out.println("lalalalayyyyyy");
    }

    public static void main(String[] args) {
ConstructorCall3 obj=new ConstructorCall3();
    }




}
