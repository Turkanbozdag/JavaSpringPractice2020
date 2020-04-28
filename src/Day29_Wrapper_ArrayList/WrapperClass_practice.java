package Day29_Wrapper_ArrayList;
/*
String[]arr={"1,"2.5",3,3.5}find max min */
public class WrapperClass_practice {
    public static void main(String[] args) {
       double[]arr={1,2.5,3,3.5,4.5};
       double max=Double.MIN_VALUE;
       for(double each:arr){
           if(each>max){
               max=each;
           }
       }
        System.out.println(max);
        System.out.println("======================");
        String[]arr2={"1","2.5","3","3.5","4.5"};

        double[]numbers=new double[arr2.length];
        numbers[0]=Double.parseDouble(arr2[0]);

    }

}
