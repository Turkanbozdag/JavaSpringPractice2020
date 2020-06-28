package day42_Inheritance;

public class Data {
    public static String publicData="public";
    protected static String protectedData="protected";
    static String defaultData="default";
    private static String privateData="private";


class testing extends Data{
    /*public,default,protected

     */
    public void main(String[] args) {//hocakinde static vardi bende kabul etmedi
        System.out.println(testing.defaultData);
        System.out.println(testing.protectedData);
        System.out.println(testing.publicData);
       // System.out.println(testing.privateData);

    }

}

}
