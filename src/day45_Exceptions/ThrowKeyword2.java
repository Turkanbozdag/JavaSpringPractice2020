package day45_Exceptions;

public class ThrowKeyword2 {
    public static void main(String[] args)throws Exception {//burda yazmamikzin dezavantaji hata cikinca baska yerlerde bunu kullanamyiz cunlu main method sorumlu
        System.out.println("java");
        Thread.sleep(3000);

        System.out.println("Cybertek");
        Thread.sleep(3000);

        System.out.println("Batch 18");
        Thread.sleep(4000);

        System.out.println("Complete");

        ArithmeticException obj1=new ArithmeticException();
        throw new ArithmeticException();
    }




}
