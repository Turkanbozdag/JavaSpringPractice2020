package Quizlerehazirlik;

public class staticccc {

    int a2=200;//instance
    static int a3=300;//static
    public static void main(String[] args) {

        staticccc obj2=new staticccc();
        obj2.a2=2000;
        obj2.a3=7000;

        int a1 = 100;//local variable
        staticccc obj1=new staticccc();
        obj1.a2=1000;
        obj1.a3=4000;

        System.out.println(obj1.a3);
        System.out.println(obj2.a3);

    }



}
