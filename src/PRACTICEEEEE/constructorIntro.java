package PRACTICEEEEE;

import Day37_constructor.ConstructorIntro;

public class constructorIntro {
    public constructorIntro(int a){//constructor with argument
        System.out.println("contructor with parameter of int");

    }

    public static void main(String[] args) {
        //ConstructorIntro obj=new constructorIntro();//obj must be created with existing contructor
        constructorIntro obj2=new constructorIntro(10);
        constructorIntro obj3=new constructorIntro(20);


    }





}
