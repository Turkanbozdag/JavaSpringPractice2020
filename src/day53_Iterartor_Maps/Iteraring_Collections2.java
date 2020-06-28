package day53_Iterartor_Maps;

import Day17_WhileLoop.WhileLoopPractic;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Iteraring_Collections2 {
    public static void main(String[] args) {


        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet", "Osman", "ozgur", "ozgur", "ozgur", "Irina"));
        System.out.println(names);
        System.out.println("+=================================");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String s = it.next();//String s=it.next()
            if (s.toLowerCase().contains("m")) {
                it.remove();
            }
        }


        System.out.println(names);
        System.out.println("================================================================================");
        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList("Mehmet", "Mohammed", "yucel", "sha", "Ozgur", "Ahmet", "Osman", "Ozgur", "ozgur"));
        for (Iterator<String> I = students.iterator(); I.hasNext(); ){
            String s = I.next();
            if (s.contains("m") || s.contains("M")) {
                I.remove();
            }

        }
        System.out.println(students);
        System.out.println("=======================================================================");
        LinkedHashSet<String>n=new LinkedHashSet<>();
        n.addAll(Arrays.asList("Mehmet","Mohammed","yucel","Sha","ozgur","Ahmet","osman","Ozgur","ozgur","ozgur"));
        System.out.println(n);
        System.out.println("--==================================================================");
        LinkedHashSet<String>R=new LinkedHashSet<>();
        R.addAll(Arrays.asList("Mehmet","Mohammad","yucel","Sha","Ozgur","Ahmet","Osman","Ozgur","ozgur","ozgur","irina"));
        R.retainAll(Arrays.asList("yucel","Sha","Ahmet"));

        //T.addAll(Arrays.asList("Mehmet","Ozgur","Mphammed")));
        System.out.println(R);
        System.out.println("++=============================================================================================");
        List<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));
        //verify 5,6,9,8 are contained in the list
        boolean result=list.containsAll(Arrays.asList(5,6,9,8));///false
        System.out.println(list.containsAll(Arrays.asList(5,6,9,8,11)));
        System.out.println(result);


    }
}
