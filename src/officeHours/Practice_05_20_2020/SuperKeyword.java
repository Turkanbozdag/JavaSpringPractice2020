package officeHours.Practice_05_20_2020;
class Data{
    int a=100;
    public void method(){
        System.out.println("hello World");
    }

}
public class SuperKeyword extends Data{
    int a=200;
    public void method(){
        System.out.println("hello cybertek");
    }
    public SuperKeyword(){
       this.method();
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        SuperKeyword obj=new SuperKeyword();
    }


}
