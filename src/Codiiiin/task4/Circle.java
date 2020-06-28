package Codiiiin.task4;

public class Circle extends Shape {
    public double radius;
    public static double PI=3.14;

    public Circle(double radius){
        this.radius=radius;
    }
    /*
    area,primeter
    calculateArea & calculatePrimeter
     */
    public void calculateArea(){
        area=radius*radius*PI;
        System.out.println("area of the Cicle:"+area);
    }

        public  void calculatePerimeter(){
        Perimeter=radius*2*PI;
            System.out.println("perimeter of the Cicle :"+Perimeter);
        }



}
