package Day38_Constructors;

public class circle {


static double pi=3.14;
double radius;
double diameter;

    static {
        pi=3.14;
    }


public circle(double radius){
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
    return "circle radius: "+radius+",cicles diameter:"+diameter+", cic area"+area()+",primeter:"+perimeter();
}


}
