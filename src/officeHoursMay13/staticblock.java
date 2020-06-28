package officeHoursMay13;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class staticblock {
static String str;
//str=str.toUperCase();
static {
    str="cybertek";
    str="harvar";
    str="Mit";

}
public static void main(String[] args) {
    str="cybertek";
    System.out.println(str);
}

}
class staticBlockTest{

    public static void main(String[] args) {
        //str="cybertek";
        System.out.println(staticblock.str);
    }
}
