package Practice_05_06_2020;

import Resources.Test;

public class TestersObject {
    public static void main(String[] args) {
       Tester tester1=new Tester();

       tester1.name="muhtar";
       tester1.jobTitle="SDET";
       tester1.salary=120000;
       tester1.emloyeeId=12345;
        System.out.println(tester1);

        Tester tester2=new Tester();
        tester2.setInfo("Turkan","Sdet",120000,12345);

        System.out.println(tester2);
         tester1.smokeTesting();
        tester2.smokeTesting();
        tester2.creatingTicket();





    }
}
