package Day44_Exceptions;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("java");
        waits(5);
        System.out.println("Cybertek");
    }
    public static void waits(int seconds){
        try {
            Thread.sleep(seconds*2000);
        }catch (Exception e){}
        }
    }

