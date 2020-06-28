package Quizlerehazirlik;

public class cuma {
   public cuma(){

        System.out.println("A");
       //this(10);

    }
    public cuma(int a){
       this(2.5);
        System.out.println("B");
    }
public cuma(double c){
       this();
       //this(100);
    System.out.println("C");

}
    public static void main(String[] args) {
        cuma obj=new cuma(100);
    }





}
