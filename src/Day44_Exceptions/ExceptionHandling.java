package Day44_Exceptions;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class ExceptionHandling {
    public static void main(String[] args) {
        String str="Cybertek";
        try{
            System.out.println(str.charAt(100));

        }catch(RuntimeException e){
            String discription=e.getMessage();
            System.out.println(discription);
        }
        System.out.println("=======================");
        System.out.println("completed");
        try {
            System.out.println(100 / 0);
        }catch (ArithmeticException e){
            System.out.println("catch block");
            String description=e.getMessage();
            System.out.println(description);
        }
        System.out.println("completed");
    }
}
