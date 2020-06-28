package Day44_Exceptions;

public class try_catchblocks2 {
    public static void main(String[] args) {
        System.out.println("hello");
        try {
            Thread.sleep(2000);
            System.out.println("Try block");
        }catch(Exception e){
            System.out.println("catch block");

        }
        System.out.println("world");



    }
}
