package Quizlerehazirlik;

import javax.imageio.stream.ImageInputStream;

public class ConstructorPractice {
    public ConstructorPractice(){

        System.out.println("A");

    }
    public ConstructorPractice(int a){
        this(5.5);
        System.out.println("B");
    }
    public  ConstructorPractice(double a){
       // this(5.5);
        System.out.println("hersey cok guzel olacak");
        System.out.println("C");
        //this(10);

    }

    public static void main(String[] args) {

    }

}
