package day43_MethodOverriding.CARTask;


import day43_MethodOverriding.Shape;

public class Circle extends Shape {
    public double radius;
    //public double raius;
    public static double PI = 3.14;


    public Circle(double radius) {// burasi contructor
        this.radius = radius;
    }
         /*
    calculateArea &calculatePrimeter
     */
        public void calculateArea(){
                    area = radius * radius * PI;
            System.out.println("Area of the circle:" + area);
        }
        public void calculatePerimeter(){
            perimeter=radius*2*PI;
            System.out.println("primeter if the circle: "+perimeter);
        }

    }





