package day47_Abstraction;
final class Test1{//reguler class
    public Test1(){}//constructor class
    public void method1(){}
    public static void method2(){}
    //public abstract  void method3();//abract reguler class kabbul etmiyor ya instance olacak
    //non-abstarct class can not: abstarct methods
    //can:constructor,instance method,static method,instance bloc,static bloc,insatnce variable,static variable...hepsi reguler class olur

    int a=100;
    static int b=200;
    {

    }
    static {

    }
}
abstract class Test2{//abstarctclass
    public Test2(){}
    public void method1(){ }
    public static void method2(){}
    public abstract void method3();
    int a=100;//instance variable
    static int b=200;

    {

    }
    static {

    }


}
public class abstract_Vs_NonAbstract {







}
