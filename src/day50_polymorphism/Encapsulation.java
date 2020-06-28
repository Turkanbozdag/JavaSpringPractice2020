package day50_polymorphism;

public class Encapsulation {
    private String username="MIT";//buraya ne yazarsan getter onu okuyacak returnde eger onun variable varsa reutnde"Cybertek" varsa onu yazacak
    public String getUsername(){
        return username;
    }
    //getter and setter always instance method()
    public void setUsername(String username){
                this.username=username;                //String yerine long yada diger peremiterlari yazsak olmaz her iki tarfta ayni olmak zorunda
    }
}
class Test{
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        //System.out.println(obj.username);
        System.out.println(obj.getUsername());
       // obj.getUsername()="Cybertek";
        obj.setUsername("Cybertek");
        System.out.println(obj.getUsername());


    }
}
