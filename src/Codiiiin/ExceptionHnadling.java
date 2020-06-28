package Codiiiin;

public class ExceptionHnadling {
    public static void main(String[] args) {
        String str="Cybertek";

        try{
            System.out.println(str.charAt(100));
        }catch (RuntimeException e){
            String discription=e.getMessage();
            System.out.println(discription);

        }

        System.out.println("===================================");

        try {

            System.out.println(100 / 0);//burda complar ok duru yo
        }catch (ArithmeticException e){
            String description=e.getMessage();//bunu niye anladim asgidaki soutta string oldugu icin
        }
        System.out.println("completed");
    }
}
