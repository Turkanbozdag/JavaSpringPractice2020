package Practice1.task02.task01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DeviceObjects {
    public static void main(String[] args) {
        TV tv1=new TV("samsung","E250",500,"40 inches","large");
        tv1.country="USA";
        System.out.println(tv1);

        Phone phone1=new Phone("Iphone","11",1000,"large");
        System.out.println(phone1);
    }




}
