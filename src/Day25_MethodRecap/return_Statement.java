package Day25_MethodRecap;

public class return_Statement {

    public static void main(String[] args) {

method2();
        System.out.println("hello");


    }
    public static void method1(){

        if (10>9){
            return;
        }
        System.out.println("hello cybertek");
    }

    public static void method2(){
        if (10>9){
            System.exit(0);
        }
        System.out.println("hello cybertek");
    }
}
