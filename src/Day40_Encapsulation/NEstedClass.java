package Day40_Encapsulation;

public  class NEstedClass {//data member of this clsaa

     static class data{
         static int a=100;
         static int b=300;

    }

    public static void main(String[] args) {
        //NEstedClass.data;
        System.out.println(NEstedClass.data.a);
    }



}
