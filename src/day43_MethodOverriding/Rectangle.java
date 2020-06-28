package day43_MethodOverriding;

public class Rectangle extends Shape {
    /*
    inherited:
    area,perimeter
    calculatArea(),calculatePerimeter()
     */

    public double length;
    public double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
public void calculateArea(){
        area=length*width;
    System.out.println("area of the rectangle: "+area);
}
public void calculatePerimeter(){
        perimeter=(width+length)*2;
    System.out.println("perimeter of the rectangle:"+perimeter);
}




}
