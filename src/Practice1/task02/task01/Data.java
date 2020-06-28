package Practice1.task02.task01;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Data {
    public static String publicData = "public";
    protected static String protectedData = "protected";
    static String defaultData = "default";
    private String privateData = "private";

}
    class testing extends Data{
    /*public,default,protected

     */
        public static void main(String[] args) {
            System.out.println(testing.defaultData);
            System.out.println(testing.protectedData);
            System.out.println(testing.publicData);
           //system.out.println(testing.privateData);

        }






}
