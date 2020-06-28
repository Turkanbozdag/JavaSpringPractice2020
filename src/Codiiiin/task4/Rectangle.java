package Codiiiin.task4;

public class Rectangle extends Shape {
    /*
    inherited:
    area,perimeter
    calculateArea(),calculatePerimeter()
     */
     public double length;
     public double width;

     public Rectangle(double length,double width){
         this.length=length;
         this.width=width;
     }

public void calculateArea(){
         area=length*width;
    System.out.println("area of the Rectangele"+area);
}

public void calculatePerimeter(){
         Perimeter=(width+length)*2;
    System.out.println("perimeter of the rectangle: "+Perimeter);

}


}
