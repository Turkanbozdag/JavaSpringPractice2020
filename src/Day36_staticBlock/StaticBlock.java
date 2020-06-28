package Day36_staticBlock;

public class StaticBlock {

    static {
        System.out.println("helloWorld");//nerde olursa olsun ilk o executed
    }
    public static void main(String[] args){
        method1();
    }
    public static void method1(){
        System.out.println("custom method block executed");
    }
    static {
        System.out.println("static block executed");
    }

}
