package Practice1;

public class Car {
    String brand;
    String model;
    int year;
    double price;
    public Car(String brand,String model,int year,double price){//default constructor
       this.brand=brand;
       this.model=model;
       this.year=year;
       this.price=price;

    }
    public String toString(){
        return year+" "+brand+" "+model+" $"+price;
    }






}
