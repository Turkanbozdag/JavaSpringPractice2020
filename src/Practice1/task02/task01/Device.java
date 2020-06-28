package Practice1.task02.task01;

public class Device {
    public String brand;
    public String model;
    public double price;
    public static String country="china";
    public String type;

    public String size;

    public String toString(){
        return "brand:"+brand+", model:"+model+",type:"+type+", size:"+size+",price: $"+price+", made in:"+country;

    }
    public void setDevice(String brand,String model,double price,String type,String size){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.type=type;
        this.size=size;

    }





}
