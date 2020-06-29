package day54_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {
    public static void main(String[] args) {
        LinkedHashMap<String,String>fb=new LinkedHashMap<>();
        fb.put("Tester01","password1");
        fb.put("Tester02","password1");
        fb.put("Tester02","password2");
        fb.put("Tester03","password03");
        fb.put("Tester05","password05");


        System.out.println(fb);
        System.out.println("==========================================");

        for (String eachKey:fb.keySet()){
           // System.out.println(eachKey+" "+fb.get(eachKey));
            System.out.println(eachKey);
        }
        List<String>usernames=new ArrayList<>(fb.keySet());
        System.out.println(usernames);
        System.out.println("======================================================");
        fb.values();
        for (String eachvalue:fb.values()){
            System.out.println(eachvalue);
        }
        List<String>passwords=new ArrayList<>(fb.values());
        System.out.println(passwords);

        System.out.println("============================================================");







    }





}
