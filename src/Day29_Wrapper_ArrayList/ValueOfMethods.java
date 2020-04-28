package Day29_Wrapper_ArrayList;

import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str="123";
        Integer a=Integer.valueOf(str);//integer,123
        System.out.println(a);
        double c=10;
        double b=Integer.valueOf(str);
        System.out.println(b);
        System.out.println("==========================================");
        int z1=2000;
        //Long L1=z1;//does not accept any other primitives except for long
        Short sh1=2000;
        int z2=sh1;

        /*
        "true"
        "false"
        "10000000000.5=====>to float
        "123456===>to int
         */
        String r1="true";
        boolean t1=Boolean.valueOf(r1);//boolean true
        boolean t2=Boolean.valueOf(r1);

        System.out.println(t1);
        System.out.println(t2);
        int maxNum=Integer.MAX_VALUE;
        System.out.println(maxNum);
        double maxNum2=Double.MAX_VALUE;
        System.out.println(maxNum2);
        int minNum=Integer.MIN_VALUE;
        System.out.println(minNum);
        byte maxNum3=Byte.MAX_VALUE;
        System.out.println(maxNum3);
        byte minNum2=Byte.MIN_VALUE;

        System.out.println(minNum2);

        double[]arr=new double[3];
        System.out.println(Arrays.toString(arr));
        boolean[]arr1= new boolean[3];
        System.out.println(Arrays.toString(arr1));

    }
}
