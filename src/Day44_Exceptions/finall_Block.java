package Day44_Exceptions;

public class finall_Block {
    public static void main(String[] args) {
        try {
            System.out.println(9 / 0);
            System.out.println("try block");
        }catch(Exception e) {
            System.out.println("Catch Block");//catch block after or onother cather block declerad

        }finally {//finally block always run executed regardless of the exce
            System.out.println("finally");
        }





    }
}
