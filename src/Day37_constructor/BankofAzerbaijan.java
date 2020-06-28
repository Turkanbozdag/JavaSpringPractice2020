package Day37_constructor;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class BankofAzerbaijan {

    public static void main(String[] args) {


        ArrayList<employee> list = new ArrayList<>();
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);
        System.out.println(list.get(0));
        System.out.println(list.get(1));


    }

}
