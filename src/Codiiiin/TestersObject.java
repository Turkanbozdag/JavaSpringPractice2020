package Codiiiin;

public class TestersObject {
    public static void main(String[] args) {
   Tester tester1 =new Tester();
   tester1.name=" turkan";
   tester1.jobTitle="SDET";
   tester1.salary=120000;
   tester1.employeeId=1234;
        System.out.println(tester1);

    Tester tester2=new Tester();
    tester2.setInfo("sumbul","junior SDET",120000,123);
        System.out.println(tester2);

        tester1.smokeTesting();
        tester2.smokeTesting();

        tester2.creatingTicket();






    }
}
