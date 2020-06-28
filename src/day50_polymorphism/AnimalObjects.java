package day50_polymorphism;

import Codiiiin.classForAnimal.cat;

public class AnimalObjects {
    public static void main(String[] args) {
        Dog obj1=new Dog("Lucy",5,"Female");
        System.out.println(obj1.dogName);
        obj1.bark();//Dog object type
       Animal obj2=new Dog("Karabas",6,"Female");
       // System.out.println(obj2.dogName);
       // obj2.bark();
        obj2.eat();
        obj2.methodA();
        Animal animal1=new Cat("A","F",1);
          boolean isCat=animal1 instanceof Dog;
        System.out.println(isCat);

        Dog d1=new Dog("A",1,"f");
    Animal animal2=new Cat("Q","f",1);
    boolean r2=animal2 instanceof Animal;
        System.out.println(r2);


    }
}
