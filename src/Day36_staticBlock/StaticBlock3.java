package Day36_staticBlock;


import Day34_CustomClass.Tester;

public class StaticBlock3 {
    static  String name;
    static int num;
        static Tester tester1;
    //public static void main(String[] args) {
       // name="muhtar";
      //  num=200;
        static{
            name="muhtar";
            num=100;
            tester1=new Tester();
            tester1.setTesterInfo("Ay",5657,"tester",678);
        }

    }

