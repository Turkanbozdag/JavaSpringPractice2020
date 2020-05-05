package Day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Denerys", 67198798, "QA", 2000);
        Tester tester2 = new Tester();
        tester2.setTesterInfo("venera", 2345679, "senior Sdet", 15000);

        Tester tester3 = new Tester();
        tester3.setTesterInfo("sha", 6235469, "SDET", 12000);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("muhtar", 111, ",manualy tester", 1200);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("john", 222, "uber", 6000);

        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1, tester2, tester3, tester4, tester5));
        testers.removeIf(p -> !p.JobTitle.contains("SDET"));
        double totalBudget=0;
        for (Tester each : testers) {
            System.out.println(each);
            totalBudget += each.salary;
        }

    }
}