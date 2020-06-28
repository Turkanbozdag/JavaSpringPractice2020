package Quizlerehazirlik;

import Day37_constructor.InstanceBlock;

public class data {
    static int staticvariable=300;
    int instancevariable=400;
    public static  void staticmethod(){
        System.out.println("static method");
    }
    public void instancemethod(){
        System.out.println("instance method");
    }
    {
        System.out.println("instance block");
    }
    public static void main(String[]args){
        InstanceBlock obj=new InstanceBlock();
    }




}
