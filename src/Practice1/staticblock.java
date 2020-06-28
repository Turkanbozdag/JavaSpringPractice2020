package Practice1;

import Day36_staticBlock.StaticBlock4;

public class staticblock {

    static  String name;
    static Tester tester1=new Tester();
    //tester1.setInfo("muhtar",123,)

    static{
        //gets executed as soon as the class i sloaded
        //designed to initialize static variables
        name="cybertek Scholl";
        tester1.setTesterInfo("turkan",123,"Development",1300000);
        tester1.setTesterInfo("vildan ",1234,"Development",1500000);

        StaticBlock4 obj1=new StaticBlock4();
      // obj1.insvariable=300;

    }

    //public static void main(String[] args) {
       // System.out.println(name);
       // System.out.println(tester1);

    //}



    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);
    }
}
