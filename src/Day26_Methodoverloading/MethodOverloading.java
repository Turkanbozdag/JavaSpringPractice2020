package Day26_Methodoverloading;

public class MethodOverloading {
    public static void main(String[] args) {

        method(10);// orginal overloded
        method(10.0);//overloding
    }
    public static void method(int a){// (int a) firs method
        System.out.println("original method");
    }
    public static void method(double a){//(int a, int b)
        System.out.println("overloadd method");
        }

    }

