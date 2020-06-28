package day43_MethodOverriding;
class Test{
    //protected yapti sonra
    public void method(){
        System.out.println("onur");
    }
}
public class MethodOverriding extends Test{
    @Override
    public void method() {//parameter degis eror
        System.out.println("zarina");
    }

    public static void main(String[] args) {
        Test obj1=new Test();
        obj1.method();//onur

        MethodOverriding obj2=new MethodOverriding();
        obj2.method();//zarina
    }

    }


