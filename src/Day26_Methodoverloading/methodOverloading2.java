package Day26_Methodoverloading;

import java.util.Arrays;

public class methodOverloading2 {
    /*
    first method :print the sum of two numbers
    second:print the sum of three int numbers
    third method:orint the sum four int number
     */
    public static void main(String[] args) {
        //10,5
        sum2Numbers(10,5);
        //10,5,15
        sum3Numbers(10,5,15);
        //10,20,30,5
        sum4Numbers(10,20,30,5);
        System.out.println("==================");
        //10,5




        int[]arr={5,4,7,1,2};
        char[]arr2={'z','s','a'};
        double[]arr3={7.4,6,5,20.6};

        Arrays.sort(arr);
        Arrays.sort(arr2);
        Arrays.sort(arr3);//same

    }

    public static  void sum2Numbers(int a,int b){
        System.out.println(a+b);
    }
    public static void sum3Numbers(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void sum4Numbers(int a,int b,int c,int d) {
        System.out.println(a + b + c + d);
        //=================================
       // public static void sum(int a, int b){
            System.out.println(a + b);
        }
       // public static void Sum( int c, int d){
         //   System.out.println(a+b+c);
      //  }
       // public static void Sum(int a,int b,int c,int d){
          //  System.out.println(a+b+c+d);
        }

   // }
//}
