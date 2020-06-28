package Day36_staticBlock;

import Day34_CustomClass.Tester;

public class StaticBlock4 {
    static  String name="Cybertek School";
    static Tester tester1=new Tester();
    //tester1.setInfo()

    int insVariable;
    static{
        //gets executed as soon as the class is loaded
        //designed to initialize static variables
        name="Cybertek School";
        tester1.setTesterInfo("mahmut",123,"SDET",12000);
        tester1.setTesterInfo("namik",3545,"SDET",120000);
        //StaticBlock4.obj1=new StaticBlock4();
       // obj1.insVariable=300;// Do Not use static block for initializing instance variables
    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(tester1);
        StaticBlock4 obj2=new StaticBlock4();
        System.out.println(obj2.insVariable);
    }

}
