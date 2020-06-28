package Resources;

import Day40_Encapsulation.Encapsulation;

public class Encapsulations_Test {
    public static void main(String[] args) {

        Encapsulation obj= new Encapsulation();
       // Encapsulation obj2=new Encapsulation();
       // obj2.SSN=1000;

        System.out.println(obj.getSSN());//0
        obj.setSSN(123);

    }
}
