package PRACTICEEEEE;

import Day34_CustomClass.Tester;

public class Allahimyarabbim {
        static int a;
        static int b;
        int c;
       static Tester tester1= new Tester();

    public static void main(String[] args) {
        tester1.setTesterInfo("vildan",123,"SDET",12000000);
        System.out.println(tester1);
    }
        static{
            a=100;
            b=200;
            if (100>200) {
                a = 100;
            }else{
                b=200;
            }
        }

/*
    public static void main(String[] args) {
        System.out.println("hello Cybertek");
    }
        static {
            System.out.println("hello world");
        }

        public static void method1 () {
            System.out.println("custom method executed");
        }
*/


}
