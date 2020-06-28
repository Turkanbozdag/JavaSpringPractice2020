package Codiiiin.task4;

public class Square extends Shape{
    public double side;
    public Square(double side){
        this.side=side;

    }
    public void calculateArea(){
        area=side*side;
        System.out.println("area of square"+area);
    }
public void calculatePerimeter(){
        Perimeter=(4*side);
    System.out.println("peremeter of square:"+Perimeter);
}




}
