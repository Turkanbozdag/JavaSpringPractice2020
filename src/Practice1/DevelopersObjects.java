package Practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObjects {
    public static void main(String[] args) {
        Developer developer1=new Developer();
        developer1.setInfo("lele ","Senior DEvelopment",140000,1234);

        Developer developer2=new Developer();
        developer2.setInfo("rumeysa ","tester",120000,12344);

        System.out.println(developer1);

        developer1.coding();

        developer2.fixingBug();

        developer1.fixingBug();
        developer2.fixingBug();
        System.out.println("=================================");
        Developer[]arr={developer1,developer2};

        for(Developer each:arr){ //arr data collection
            System.out.println(each.name+" "+each.salary);

        }
        System.out.println("===============");
        ArrayList<Developer>developers=new ArrayList<>(Arrays.asList(arr));
       // developers.addAll(Arrays.asList(developer1,developer2));
        System.out.println(developers.size());


        for (int i=0;i<developers.size();i++){
            System.out.println(developers.get(i).name);
        }
        System.out.println("+++++++++++++++++++++++++");
        for (Developer turkan:developers){
            System.out.println(turkan);
        }




    }
}
