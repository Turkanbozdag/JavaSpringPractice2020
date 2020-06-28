package PRACTICEEEEE;

public class Iteem {
    String name;
    double unitprice;
    int quantitiy;
    public Iteem(String name,double unitprice,int quantity){
        this.name=name;
        this.quantitiy=quantity;
        this.unitprice=unitprice;
    }
    public  double calcCost() {

      return  quantitiy * unitprice;

    }
    public  String toString(){
        return "Item:"+name+", Unit price: $"+unitprice+",Quantity:"+quantitiy+"\ntotal cost of item: $"+calcCost();


    }




}
