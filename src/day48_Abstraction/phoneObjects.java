package day48_Abstraction;

public class phoneObjects {
    public static void main(String[] args) {
        subclass_Iphone iphone=new subclass_Iphone("X",1000,"10 inches");
        subclass_Iphone iphone1=new subclass_Iphone("9",900,"8 inch");
        System.out.println(iphone);
        System.out.println(iphone1);

        System.out.println("==============");
        iphone.faceTiming(123456);
        iphone.calling(911);
        iphone.texting(98765);
       // iphone.freezing

        System.out.println("===========================");
        Samsung samsung1=new Samsung("Note10 Plus",1200,"large");
        System.out.println(samsung1);
        samsung1.calling(123456);
       // samsung1.faceTiming(123456);
        samsung1.freezing();



    }





}
