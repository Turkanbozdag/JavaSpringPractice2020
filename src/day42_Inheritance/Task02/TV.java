package day42_Inheritance.Task02;
/*create a class called TV:
				attributes: brand, model, price, country
				methods: watch, toString
*/
public class TV extends Device {
    /*
    brand(inherited)
    model(inherited)
    price(inherited)
    country(inherited)
    type(inherited)

    setDevice
    watch
    toString(inherited
     */
    public TV(String brand,String model,double price,String type,String size){
        setDevice(brand,model,price,"TV", size);
    }

    public void wacth(){
        System.out.println(" I am watching "+brand+""+model+""+type+"that cost me $"+price);
    }


}
