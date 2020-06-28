package Codiiiin.classForAnimal;

public class Pet {
    /*
    custom class:pet
    variable:name,age,color,size,breed,ispet,numberOfeyes
    methos:eat,sleep,drink,toString
     */
   protected String name;
    protected int age;
    protected String color;
    protected String size;
    protected String breed;
    protected static boolean ispet=true;
     protected static int numberOfeyes=2;

     public void setInfo(String name,int age,String color,String size,String breed){
         this.name=name;
         this.age=age;
         this.color=color;
         this.size=size;
         this.breed=breed;

     }

public  void eat(String food){
    System.out.println(name+"is eating"+food);
}
public void sleep(String place){
    System.out.println(name+"is sleeping"+place);

    }
    public void drink(String drink){
        System.out.println(name+"is drinking "+drink);
    }
    public String toString(){
    return "name "+name+", age"+age+", color "+color+",size"+size+", breed"+breed;

    }


}
