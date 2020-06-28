package day50_polymorphism;

public class Dog extends Animal {//3 variables
    public String dogName;
    public Dog(String dogname,int age,String gender){
        this.dogName=dogname;
        this.age=age;
        this.gender=gender;

    }
    public void eat(){
        System.out.println("Dog"+dogName+"is eating");
    }
    public void sleep(){
        System.out.println("Dog"+dogName+"is sleeping");
    }
    public void bark(){
        System.out.println("Dog"+dogName+"is sleeping");
    }
    public static void methodA(int a){
        System.out.println("Dog Class A");
    }
}
