package Quizlerehazirlik;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name,double unitPrice,int quantity){//default contro
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;

    }
    public  double calCost(){
        return quantity*unitPrice;
    }
    public String toString(){
        return "Item:"+name+",unit price: $"+unitPrice+", Quantity:"+quantity+"\n total cost of Item: $"+calCost();
    }



}
