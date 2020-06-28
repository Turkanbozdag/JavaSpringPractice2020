package DaylyPractice;

public class Encapsulation {
   private String username="MILk";
   public String getusername(){//read only
       return username;
   }
public void setUsername(String username){//write
   this.username= username;
}

}
class Test{
public static void main(String[]args){
     Encapsulation obj=new Encapsulation();
    //System.out.println(obj.username);
    System.out.println(obj.getusername());
    obj.setUsername("Cybertek");
    System.out.println(obj.getusername());

        }
        }
