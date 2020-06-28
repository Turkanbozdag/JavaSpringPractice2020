package Quizlerehazirlik;

public class EncapTest {
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();

       // System.out.println(obj.SSN);
        System.out.println(obj.getSSN());//return me 0

        obj.getSSN();
        //obj.SSN=122345;direck yazamiyoz
        obj.setSSN(123456);
       // System.out.println(obj.SSN);
        System.out.println(obj.getSSN());//return me 12345 because top we have
        //obj.setSSN(obj.getSSN());





    }
}
