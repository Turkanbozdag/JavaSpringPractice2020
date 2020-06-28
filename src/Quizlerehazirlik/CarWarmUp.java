package Quizlerehazirlik;

public class CarWarmUp {
String brand;
String model;

int year;
double price;

public CarWarmUp(String brand){this.brand=brand;}
    //this(brand);
    //this.brand=brand;

public CarWarmUp(String brand,String model){
    this.brand=brand;
    this.model=model;
}
public CarWarmUp(String brand,String model,int year){
    this(brand,model);
    this.year=year;

}
public String toString(String brand,String model,int year){
   // this(brand,model);
    this.year=year;
    return year+""+brand+""+model+" $"+price;
}





}
