package Day38_Constructors;

public class Dog {
    String name;
    String breed;
    int age;
    public Dog(){//sets default value for all instances
        name="";
        breed="";
        age=0;
    }
    public Dog(String breed){
        this.breed=breed;
        name="unknown";
        age=0;

    }
    public Dog(String breed,int age){
        this.breed=breed;
        this.age=age;

    }

    public String toString(){
        return "name:"+name+", breed:"+breed+",age:"+age;
    }
    public void method1(){

    }
    public void method1(int a){

    }





}
