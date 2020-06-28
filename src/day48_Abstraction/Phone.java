package day48_Abstraction;
/*
ask01:

        1. create an abstract class called Employee

                attributes: name, age, gender, salary, jobtitle

                methods:

                        abstract methods: work()

                        instance method:  toString()
 */
public abstract class Phone {
    static {
        brand = "iphone";
    }

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(long phoneNumber);


    public abstract void texting(long phoneNumber);




    public String toString(){
        return" Brand:"+brand+", Model:"+model+", price:$"+price+", size:"+size;
    }






}
//abstract class A extends Phone{

//}
