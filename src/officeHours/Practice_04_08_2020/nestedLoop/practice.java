package officeHours.Practice_04_08_2020.nestedLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class practice {
    public static void main(String[] args) {

        //nested loop:loop inside another loop inner loop&outer loop
        // nested loop:we only need them when we need to repeat a loop
        int j=1;
        while(j<6){
            for (int i=10;i<=50;i+=10){
                System.out.println(i+" ");
            }
        }
        for (int i=10; i<=50;i+=10){
            System.out.println(i+" ");
        }
        System.out.println();
        for (int i=10;i<=50;i+=10){

        }
        System.out.println();
        for (int i=10;i<=50;i+=10){

        }

        for (int i=10;i<=50;i+=10){

        }


        System.out.println("==========================================");

        for(int k=0; k<=5;k++){
            System.out.println("* ");
        }
        System.out.println();
}

    }
