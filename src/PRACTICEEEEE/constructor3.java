package PRACTICEEEEE;

public class constructor3 {
    public constructor3(){
        this(9);
        System.out.println("default");
    }
    public constructor3(int a){

        System.out.println(" int argument");

    }
    public void method1(){

    }
    public constructor3(String str){
       // this("hello");
    }

    public static void main(String[] args) {
    new constructor3 ();
    }
}
