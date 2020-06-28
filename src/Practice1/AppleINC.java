package Practice1;

public class AppleINC {
    public static void main(String[] args) {
        Tester tester1=new Tester();
        tester1.setTesterInfo("Mesut",12568,"Senior Develper",1500000);

        Tester tester2=new Tester();
        tester2.setTesterInfo("mehmet",124,"tester",120000);

        Tester tester3=new Tester();
        tester3.setTesterInfo("Abdullah",345,"developer",1400000);

        ScrumTeam scrum1=new ScrumTeam();
        scrum1.hireTester((tester3));
          for (Tester vildan:scrum1.testersTeam){
              System.out.println(vildan);

        }
    }
}
