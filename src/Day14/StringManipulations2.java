package Day14;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringManipulations2 {
    public static void main(String[] args) {
        String str="";
        boolean bool1=str.isEmpty();// true because empty
        System.out.println(bool1);
        String username="";
        if (username.isEmpty()){
            System.out.println("please provide the user name");
        }

        String s1="cat";
        String s2=new String("cat");
        System.out.println(s1==s2);
      System.out.println  (  s1.equals(s2) );//true


        String z1="tiger";
        String z2=new String("tiger");
        String z3="tiger";
        System.out.println(z1==z2);//false
        System.out.println(z2==z3);//false
        System.out.println(z1==z3);//true

        System.out.println(z1.equals(z2));
        System.out.println(z2.equals(z3));







    }
}
