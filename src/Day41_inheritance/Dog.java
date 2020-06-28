package Day41_inheritance;

public class Dog extends Animal {

    public void bark(){//uniqe olani burda inhitinace ettik
        System.out.println(name+"is barking");

    }

    /*
    public String name;
    public String size;
    public double weight;
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void move(){
        System.out.println(name+" is moving");
    }
     */
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="lucy";

        System.out.println(dog1.name);

        dog1.move();
        dog1.eat();
       // dog1.swim();
        dog1.bark();





    }
}
