package Codiiiin.task01;

public class EmployeeObjects{
    public static void main(String[] args) {
        developer dev1=new developer(120000,"aydin",123,"Developer",'M');
        //dev1.reporting();
        dev1.fixingBug();

        System.out.println(dev1);

        tester tester1=new tester("mesut",150000,456,"Developer",'M');
        tester1.reporting();
        System.out.println(tester1);

        BusinessAnalyist BA1=new BusinessAnalyist("Vildan",1600000,357,"BA",'F');
        BA1.writingReq();
        BA1.gathering();
        System.out.println(BA1);

    }
}


