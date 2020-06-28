package officeHours.may27_OOP;

public class methodOverriding2 {
    protected void method1(){

    }
    public static void method2(){

    }

}
class TestClass extends methodOverriding2{

    @Override
    protected void method1(){}

//@Override
  //  public  static void method2(){}//static cannot override
    //public methodOverriding2(){}CON
    //ONLY INSATNC EMETHOD OVEERIDE
}
