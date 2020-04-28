package calis;

public class example {

    public static void main(String[] args) {
        sum(10,20);
        sum(1.5,2.5);
        //10 ,15.5


        double num1=sum(10,15.5);
        System.out.println(num1);

    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static double sum(double a, double b){
        return a+b;
    }
}
