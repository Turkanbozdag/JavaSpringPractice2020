package Practice_05_06_2020;

public class AppleINC {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setInfo("Turkan","junior Tester",140000,123456);
        Tester tester2=new Tester();
        tester2.setInfo("Vildan","SDET",120000,12345678);

        Tester tester3=new Tester();
        tester3.setInfo("Rumeysa","Tester",140000,12300009);
        ScrumTeam scrum1=new ScrumTeam();
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);
        scrum1.hireATester(tester3);
        scrum1.fireATester(1234);
         for (Tester each:scrum1.testerTeam){
             System.out.println(each);
             System.out.println("+++++++++++++++++++++++++++++++");
             Developer dev1=new Developer();
             dev1.setInfo("Turkan","senior Developer",220000,12345);

             Developer dev2=new Developer();
             dev2.setInfo("mesut","Dvelopermanager",200000,123099);

             scrum1.hireADeveloper(dev1);
             scrum1.hireADeveloper(dev2);
             scrum1.fireADeveloper(111122289);
              // for (Developer each1:scrum1.devpTeam){


               // }
             System.out.println(scrum1.devpTeam.size());







         }

    }
}
