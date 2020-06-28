package day46_final_abstract;

public class Final_Practices {
    final int a=10;
    final static int b=20;
    {
        System.out.println(a);
        //a=20;//cannot be reassinged
    }
    static {
        System.out.println(b);

    }
    public void final_practices(){

    }
   final void method1(){

    }
    public final static void method2(){//static final kavul ediyo before void

    }
    class test extends  Final_Practices{

        protected void method(){

        }
    }
}
