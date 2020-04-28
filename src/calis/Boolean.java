package calis;

import javax.sound.sampled.BooleanControl;

public class Boolean {
    public static void main(String[] args) {
        String result1="muhtar";
        /*
        boolean r1=Boolean.parseBoolean(result1);
        System.out.println(r1);
        */
        String  str="123";
        Integer a=Integer.valueOf(str);
        System.out.println(a);
        String str2="15.5";
        double d1=Double.parseDouble(str2);

        double d2=Double.valueOf(str2);
        System.out.println(d2);
        System.out.println(d1);
        System.out.println(d1==d2);
        System.out.println("============");
        int z1=2000;
       // Long L1=z1;     doesnot accept any other primitives except for long

        Short sh1=3000;
        int z2=sh1;
        System.out.println("=====");
        String r1="true";
      // Boolean t1=Boolean.valueOf (r1);
       // boolean t2=Boolean.valueOf(t2);
        //System.out.println(t1);
       // System.out.println(t2);

        int maxNum=Integer.MAX_VALUE;
        System.out.println(maxNum);




    }






}
