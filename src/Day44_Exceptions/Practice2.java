package Day44_Exceptions;

public class Practice2 {
    public static void main(String[] args) {
        /*print hello,
                wait two seconds
                rint Cybertek
                        wait three second
                        Java
                */
        System.out.println("Hello");
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
        System.out.println("cybertek");
        try {
            Thread.sleep(3000);

        }catch (Exception e){}
            System.out.println("java");
            try {
                Thread.sleep(4000);
            }catch (Exception e){}
                System.out.println("completed");



    }
}
