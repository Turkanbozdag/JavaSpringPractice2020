package day42_Inheritance;
class B{
    public B(int a){
        System.out.println("int");
    }
    public B(double a){
        System.out.println("double");
    }
    public B(long a){
        this(4.5);
        System.out.println("long");
        //super(4.5);
    }
}




public class InheritanceREveiw extends B{
    public InheritanceREveiw(String a){
        super(19);//long
        System.out.println("String");//string

    }
    public static void main (String[]args){
        InheritanceREveiw obj=new InheritanceREveiw("hello");

    }
}
