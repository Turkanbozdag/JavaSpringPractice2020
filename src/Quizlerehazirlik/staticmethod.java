package Quizlerehazirlik;

public class staticmethod {
    int a=100;
    static int b=300;
    public static void main(String[] args) {
        //System.out.println(a);

        System.out.println("====================");

        staticmethod obj=new staticmethod();
        System.out.println(obj.a);
        System.out.println(staticmethod.b);
        System.out.println(obj.b);

    }
    public void method(){
       // System.out.println(a);
        System.out.println(b);
    }
}
