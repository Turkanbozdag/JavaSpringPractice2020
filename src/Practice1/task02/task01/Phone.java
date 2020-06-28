package Practice1.task02.task01;

public class Phone extends Device {





    public Phone(String brand,String model,double price,String size){
       setDevice(brand,model,price,"phone",size);
    }
    public void call(long number){
        System.out.println("callin the number :"+number);
    }
    public void text(long number){
        System.out.println("texting to:"+number);
    }

}
