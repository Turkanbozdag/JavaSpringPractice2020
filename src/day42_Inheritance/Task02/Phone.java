package day42_Inheritance.Task02;
/*create ba class called phone:
				attributes: brand, model, price, country
				methods: call, text,  toString
 */
public class Phone {
    /*brand,(inherited)
    model,(inherited)
    price,(inherited)

    country,(inherited)
    type="phone",(inherited)
    size
    call()
    text()
    toString(inherited)
     */
    public Phone(String brand,String model,double price,String size){
       // setDevice(brand,model,price,"phone",size);
    }
public void call(long number){
    System.out.println("calling the number:"+number);
}
public void text(long number){

}


}
