package Day37_constructor;

public class InstanceBlock {
    static {
        System.out.println("static block");//every where static executed first
    }

    {
       System.out.println("instance block");
    }

    public static void main(String[] args) {
        InstanceBlock obj=new InstanceBlock();
        InstanceBlock obj2=new InstanceBlock();

       // {
         //   System.out.println("instance block");
       // }




    }

   // {
      //  System.out.println("instance block");//instan block staticten hemen sonra kac obje varsa okdar exexuted olur
    //}



}
