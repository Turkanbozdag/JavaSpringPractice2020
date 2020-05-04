package calis;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class ucuncu {
    public static void main(String[] args) {//{1,2,1}
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        ArrayList<Integer> uniques = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (Integer each : list) {
                if (each == list.get(i)) {//0 1 2
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(list.get(i));//0 1 2
            }
            System.out.println(list);
            System.out.println(uniques);


        }


    }

}

