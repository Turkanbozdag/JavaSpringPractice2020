package Quizlerehazirlik;

public class Circle {
    static double Pi=3.14;
    double radius;
    double diameter;

    public Circle(double radius){
        this.radius=radius;
        diameter=radius*2;
    }
    public double area(){
        return Pi*radius*radius;

    }
    public double perimeter(){
        return diameter*Pi;
    }
    public String toString(){
        return "circle radius:"+radius+"\ncircles diameter:"+diameter+
                "Cicles area:"+area()+
                "cicles perimeter:"+perimeter();
    }






}
