package Day38_Constructors;

public class constructorcall3 {
    public constructorcall3(){
        this(9);//int argumnt
        System.out.println("default");
        //this(9);//very first step
    }
    public constructorcall3(int a){
       // this(10);//kendini cagiramaz
        System.out.println("Int argument");
    }
    public constructorcall3(String str){
       // this("hello");
    }

    public static void main(String[] args) {
        new constructorcall3();
    }
    public void method1(){
        //this();
        method1();//call itself but constructor no
    }





}
