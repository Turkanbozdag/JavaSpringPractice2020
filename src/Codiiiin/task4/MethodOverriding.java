package Codiiiin.task4;
class Test {
    protected void method(){
        System.out.println("Vildannnn");
    }
}
public class MethodOverriding extends Test {
        @Override//if commpale error method not overriding
    public void method(){
        System.out.println("turkan");
    }
    public static void main(String[] args) {
        Test obj1=new Test();
        obj1.method();
        MethodOverriding obj2=new MethodOverriding();
        obj2.method();
    }


}
