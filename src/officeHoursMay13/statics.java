package officeHoursMay13;

public class statics {
    int instancvariable=100;
    static int staticvariable=200;

    public static void staticmethod() {
        System.out.println(staticvariable);
    }
    public void instancemethod(){
        staticmethod();;
        System.out.println(staticvariable);
        System.out.println(instancvariable);
    }

}
