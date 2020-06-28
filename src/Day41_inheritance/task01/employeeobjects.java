package Day41_inheritance.task01;

public class employeeobjects {
    public static void main(String[]args){
        developer dev1=new developer(12000,"turkan",123,"Developer",'F');
        dev1.fixingBug();
        System.out.println(dev1);


        Tester tester1=new Tester("vildan",456,123,"QA",'F');

        tester1.reporting();
        System.out.println(tester1);

        BusinessAnalyist BA1=new BusinessAnalyist("ozgur",129000,2345,'M');

        BA1.writingReq();
        BA1.gathering();
        System.out.println(BA1);
    }




}
