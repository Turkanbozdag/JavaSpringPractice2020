package Codiiiin.nighttask;
class Test{
    public Test(int a){

        System.out.println("A");

    }
}
public class constructor extends Test{
    public constructor(){//AB
        super(10);

        System.out.println("B");
        //this(10);/super vermeye calistik error verdi
    }

    public static void main(String[] args) {
        constructor obj=new constructor();
       // Test obj=new Test();
    }

}
