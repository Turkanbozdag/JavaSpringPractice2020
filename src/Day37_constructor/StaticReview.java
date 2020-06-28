package Day37_constructor;

public class StaticReview {
    static int a;//one copy
    int b;//2,each object has its own copy of instance variable

    public static void main(String[] args) {
        StaticReview obj1=new StaticReview();
        obj1.a=20;
        StaticReview obj2=new StaticReview();
        obj2.a=30;
        System.out.println(obj1.a);//30
        System.out.println(obj2.a);//30
    }




}
