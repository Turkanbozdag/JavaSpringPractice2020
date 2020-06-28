package Codiiiin;

public class Person_Objects {
    public static void main(String[] args) {
                Person Turkan=new Person("Turkan");
        System.out.println(Turkan.name);
       // System.out.println(Turkan.SSN);
        Turkan.setSSN(123456);
        System.out.println("turkan 'SSN :"+Turkan.getSSN());

        //System.out.println(Turkan.ID);
        Turkan.setID(123456);
        System.out.println("Turkan ID:"+Turkan.getID());



    }





}
