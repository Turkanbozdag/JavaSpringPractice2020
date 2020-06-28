package day49_Polymorphisim;


import Codiiiin.classForAnimal.cat;
import Quizlerehazirlik.dog;

import java.awt.*;



class Animal extends Robot {//robot super reviev

}



class Dog extends Animal{

}
class Cat extends Animal{

}
class Robot{

}
public class Plymorphism_Intro {
    public static void main(String[]args){
       // Animal obj=new Animal();
        Animal obj2=new Dog();
        Animal obj3=new Cat();
        //  Dog obj4=new Cat();// no reletion no poliloriism between them
        Dog obj5=new Dog();
        Cat obj6=new Cat();
       // String[]animalShow={obj2,obj3,obj5,obj6};


        Animal[]animalShow={obj5,obj6};//obj5 reverans Dog
Robot obj8=new Animal();
Robot obj9=new Dog();
Robot obj10=new Cat();

    }
}
