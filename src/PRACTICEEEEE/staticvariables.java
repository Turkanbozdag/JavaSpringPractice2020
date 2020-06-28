package PRACTICEEEEE;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class staticvariables {
    int a2=200;//instance variable
    static int a3=300;//static varialble


    public static void main(String[] args) {
        int a1 = 100;//locak variable
        staticvariables obj1=new staticvariables();
        obj1.a2=1000;
        obj1.a3=4000;
        staticvariables obj2=new staticvariables();

        obj2.a2=2000;
        obj2.a3=5000;



       System.out.println(obj1.a2);
        System.out.println(obj2.a2);

        System.out.println(obj1.a3);
        System.out.println(obj2.a3);

    }
}