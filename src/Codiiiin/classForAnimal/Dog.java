package Codiiiin.classForAnimal;

public class Dog extends Pet{
    /*
    name,age,color,size,breed,ispet
     */

public Dog(String name,int age,String color,String size,String breed){
    setInfo(name,age,color,size,breed);

}

public void bark(){
    System.out.println(name+" is barking");
}

}
