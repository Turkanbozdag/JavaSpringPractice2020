package Codiiiin.Task2;
class test {
    public test(){
        System.out.println("super class' default contructor");
    }
}


public class Constructor extends test{
    public Constructor(){
        System.out.println("sub class' default constructor");

    }
    public static void main(String []args){
        //Constructor obj=new Constructor();
        //test obj=new test();
    }


}
