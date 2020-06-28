package Day40_Encapsulation;

public class Person_objects {
    public static void main(String[] args) {
        Person zarina=new Person("zarina");
        System.out.println(zarina.name);


       // System.out.println(zarina.SSN);
        zarina.setSSN(123456);//data type lon diye bu sayiyi verdik

        System.out.println("zarina'SSN "+zarina.getSSN());
        //System.out.println(zarina.ID);

        zarina.setID(567);
        System.out.println("zarina' I:"+zarina.getID());






    }




}
