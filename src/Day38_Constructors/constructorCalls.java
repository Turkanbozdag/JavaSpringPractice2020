package Day38_Constructors;

public class constructorCalls {



    public constructorCalls() {
        method1();
        method2();
    }
    public  static  void method1(){
        //method2();
        //constructorCalls();

    }

    public  constructorCalls(int a){
      //  constructorCalls();
        this();

    }
    public void method2(){
        method1();

    }


}
