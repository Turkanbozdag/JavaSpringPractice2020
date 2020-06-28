package PRACTICEEEEE;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class staticmethod{

    int a=100;//instance
    static int b=200;
    public static void main(String[] args)

     {

        //System.out.println(a);//static only accept static
        staticmethod obj=new staticmethod();
        System.out.println(obj.a);
        System.out.println("==============");
        System.out.println(b);
        System.out.println(staticmethod.b);
        System.out.println(obj.b);




    }

public void method(){
    System.out.println(a);
    System.out.println("=========================");
    System.out.println();
}




}
