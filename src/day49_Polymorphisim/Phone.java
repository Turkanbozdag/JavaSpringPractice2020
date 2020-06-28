package day49_Polymorphisim;
interface downloadable{
    boolean downloadable=true;//public static final
    void download();//public abstract

}
interface AndroidApps extends downloadable{//2 variable,1 abstract method
    String AppStoreName="Android";
}
interface AppleApps extends downloadable{
    String AppStoreName="Apple";//public static final

}
public abstract class Phone {//2 abstract
    public static String brand;
    public String model;
    public double price;
    public String size;
    public abstract void texting(long phoneNumber);//abstrcat method
    public abstract void calling(long phoneNumber);
    public abstract void faceTiming(long phoneNumber);

    public String toString(){
        return "brand="+brand+", model="+model+", price="+price+", size="+size+"price= "+price;
    }

}
/*
ask01:

    1. create an interface named Edible

            abstract method: eat();

    2. create an interface named Drinkable that can inherit from Edible

            abstract method: drink();

    3. create an class named Burger that can inherit from Edible

            variables: name, size

            method: toString();

            create a constructor that can initialize instance variables

    4. create another class called IceCoffee  that can inherit from Drinkable

                variable: size

                method: toString()

            create constructor that can set the size

    fix any error might come up


 */