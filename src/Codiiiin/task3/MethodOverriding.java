package Codiiiin.task3;
class student{
    public void printName(){
        System.out.println("Ayse");

    }
}
public class MethodOverriding extends student {
    public void print(String str) {
    }
        public void print(double a){

        }
      //  public void print(String str){}overriding cannot happen in the same class
public void printName(){
    System.out.println("turkan");
}
    public static void main(String[] args) {
        MethodOverriding obj=new MethodOverriding();
        obj.printName();//Ayse yazacak

        student obj2=new student();
        obj2.printName();
    }

    }

