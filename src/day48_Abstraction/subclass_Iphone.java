package day48_Abstraction;

public class subclass_Iphone extends Phone {
    static{
        brand="iphone";
    }
    public subclass_Iphone(String model,double price,String size){
        brand="iphone";
        this.model=model;
        this.price=price;
        this.size=size;
    }



    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling with "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting with "+phoneNumber);

    }

    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is facetiming with "+phoneNumber);






    }



}
