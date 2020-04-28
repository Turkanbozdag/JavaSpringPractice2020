package officeHours.Practice_04_22;

public class methodOverloading {
    public static void main(String[] args) {
        int num1=method1(10);
        System.out.println(num1);
    }
    public static  void method1(){
        System.out.println("hello world");
    }
    public static int method1(int a){
        System.out.println("hello cybertek");
        return 10;//return int oldugu icin10 koyduk

    }
    public static  void method1(int a,int b){
        System.out.println("Hello Batch 18");

    }
}
