package day42_Inheritance.Task02;
/*creata a class called device:
				attributes: brand, model, price, country
				methods: toString
 */
    public class Device {
public String brand;
public String model;
public double price;
public static String country="Turkey";
public String type;
public String size;


public String toString(){
    return ",brand:"+brand+",Model"+model+", type:"+type+",size"+size+",price: $"+price+"country name"+country;
}
public void setDevice(String brand,String model, double price, String type,String size){
    this.brand=brand;
    this.model=model;
    this.price=price;
    this.type=type;
    this.size=size;

}




}
