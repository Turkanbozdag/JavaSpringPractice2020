package day47_Abstraction;
abstract class A{
    public abstract void method1();//abstrac clas
    public void method2(){}
}

public class Abstgract_vs_NonAbstract2 extends A {//ManDaTory to evrride the abstract method
    public void method1(){

    }
}
abstract class B extends A{//optional to override the abstract method of A
//2 methods
    // one abstract & one instance methods
}
class C{
    
}
