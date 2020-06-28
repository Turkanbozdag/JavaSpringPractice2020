package day43_MethodOverriding;
/* create a class called ShapeActions:
variables:area,perimeter
                methods: calculateArea(), calculatePerimeter()

 */
public class Shape {
    public double area;
    public double perimeter;

    protected void calculateArea(){
        area=0;//shape bilmedigimiz icin hangi shape oldugunu ondan sufir
        System.out.println("Area of the shape: "+0);
    }
    public void calculatePerimeter(){
        perimeter=0;
        System.out.println("perimeter of shape: "+perimeter);
    }





}
