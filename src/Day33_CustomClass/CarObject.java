package Day33_CustomClass;

public class CarObject {
    public static void main(String[] args) {
       // onceki sinif  class name Car
        Car car1=new Car();
        car1.Brand="BMW";
        car1.model="X5";
        car1.year=2020;
        car1.color="Red";
        //System.out.println(brand);
        System.out.println(car1.Brand);//instance variables are object variable,we can call throuh the object name
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println("====================");
        Car car2=new Car();
        car2.Brand="Toyota";
        car2.model="Corolla";
        car2.year=2020;
        car2.color="orange";
        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);



    }
}