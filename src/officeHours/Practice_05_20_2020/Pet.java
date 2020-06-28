package officeHours.Practice_05_20_2020;

public class Pet {
    /*
    custom clsaa:pet
    variables:name,age,color,size,breed,ispet,numberofeyes
    methods:eat,sleep,drink,toString
     */
    protected String name;
    protected int age;
    protected String color;
    protected String size;
   protected String breed;

    protected static boolean isPet=true;
   protected static int numberOfeyes=2;

   public void eat(String food){
       System.out.println(name+"is eating"+food);
   }
   public void drink(String drink){
       System.out.println(name+"is drinking "+drink);
   }
   public void sleep(){
       System.out.println(name+"is sleeping");
   }
   public String toString(){
       return "name"+name+",age"+age+" ,color"+color+",size"+size+", breed"+breed;
   }





}
