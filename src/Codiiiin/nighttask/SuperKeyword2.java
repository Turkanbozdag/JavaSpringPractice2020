package Codiiiin.nighttask;
class TestData{
    int num=100;
    String name="Cyberetek";
    public void method(){
        System.out.println("cybertek School");
    }
}
public class SuperKeyword2 extends TestData {
int num=200;
String name="MIT";
public void method(){
    System.out.println("MIT School");
}
public SuperKeyword2()
{
    super.method();
    System.out.println(this.num);//200
    System.out.println(super.name);//"cybertek
}
public static void main(String []args){
    SuperKeyword2 obj=new SuperKeyword2();
}



}
