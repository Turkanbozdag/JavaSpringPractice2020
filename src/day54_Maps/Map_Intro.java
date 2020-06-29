package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {
    public static void main(String[] args) {
        Map<String,Double>employeeInfo=new LinkedHashMap<>();
        employeeInfo.put("Azra",120000.0);
        employeeInfo.put("Bakhodir",110000.50);

        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        System.out.println(  employeeInfo.get(0));

        System.out.println(employeeInfo.get("Azra"));
        System.out.println(employeeInfo.get("Bakhodir"));
        System.out.println("==================================");

        employeeInfo.remove("Bakhodir");
        System.out.println(employeeInfo);
        System.out.println(employeeInfo.size());

        employeeInfo.put("Azra",130000.0);//put(key,value)key same but value can douplucate

        System.out.println(employeeInfo);






    }






}
