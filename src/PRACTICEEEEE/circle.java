package PRACTICEEEEE;

public class circle {
    static double pi=3.14;
    double radius;
    double diameter;
    public  circle(double radius){
        this.radius=radius;
        diameter=radius*2;

    }
    public  double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return diameter*pi;
    }
    public String toString(){
        return ",cicle radius:"+radius+
                ",circle diameter: "+diameter+
                " ,circles area:"+area()+
                ", cicles perimeter: "+perimeter();
    }

}
