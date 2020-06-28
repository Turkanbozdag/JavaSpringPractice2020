package startContructor;

public class Item {
    String name;
    double unitPrice;
    int quantity;
    public Item(String name,double unitPrice,int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
    public   double calcost(){
        return quantity*unitPrice;
    }
    public String toString(){
        return "Item:"+name+"unit price: $"+unitPrice+", Quantity:"+quantity+"\ntotal cost of item: $"+calcost();
    }




}
