package officeHoursMay13;

public class instance {

    String name;

   // {
    //    name="zuuu";
   // }
   public static void main(String[] args) {
       instance obj=new instance();
       obj.name="zuuuu";
       System.out.println(obj.name);
   }
    public void printName(){
        int name=100;//local variable
        System.out.println("name is:"+this.name);
    }





}
