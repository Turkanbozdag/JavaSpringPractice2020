package PRACTICEEEEE;

public class constructorpractice {
    public constructorpractice(){

        System.out.println("A");
    }
    public constructorpractice(int a){
        this(10.5);
        System.out.println("B");
    }
    public constructorpractice(double a){
        this();
        System.out.println("C");
    }

    public static void main(String[] args) {

        new constructorpractice();
    }





}
