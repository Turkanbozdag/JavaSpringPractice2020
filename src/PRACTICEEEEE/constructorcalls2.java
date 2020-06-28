package PRACTICEEEEE;

public class constructorcalls2 {

    public constructorcalls2(){
        System.out.println("default contructor");

    }
    public constructorcalls2(int a){
        this();//default consturctor this var o defaultu cagiriyo
        System.out.println("constructor with int argument");

}
public constructorcalls2(String str){
    this(10);
    System.out.println("contructor with String argument");

}

    public static void main(String[] args) {
        constructorcalls2 obj=new constructorcalls2("hello");
    }

public void method1(){

}
}