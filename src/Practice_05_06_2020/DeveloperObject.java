package Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DeveloperObject {
    public static void main(String[] args) {
        Developer developer1=new Developer();
        developer1.setInfo("leanardo","developer",125,12345);
        System.out.println(developer1);

        Developer developer2=new Developer();
        developer2.setInfo("mehmet","senior Developer",126,123456);

        developer1.coding();
        developer2.coding();

        developer1.fixingBug();
        developer2.fixingBug();
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Developer[]arr={developer1,developer2};
        for (Developer each:arr){
            System.out.println(each.name+" "+each.salary);
        }
        System.out.println("============================================");
        ArrayList<Developer>developers=new ArrayList<>(Arrays.asList(arr));

        for(Developer each:developers){
            System.out.println(each.name+" "+each.salary);
        }
    }
}
