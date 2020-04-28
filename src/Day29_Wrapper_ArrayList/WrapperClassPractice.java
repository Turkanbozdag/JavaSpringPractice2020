package Day29_Wrapper_ArrayList;

import java.util.Arrays;

public class WrapperClassPractice {
    public static void main(String[] args) {

        double[]arr={1,2.5,3,3.5,4.5};
        double max =Double.MIN_VALUE;
        for(double each:arr){//5, each:1,2.53,3.5,4.5
            if(each>max){
                max=each;
            }
        }
        System.out.println(max);

        System.out.println("==========");//if String to the double
        String[]arr2={"1","2.5","3","3.5","4.5"};
        double maxx=Double.MIN_VALUE;//2.5
        for(String each:arr2){
            double num=Double.parseDouble(each);
            if (num>maxx){
                maxx=num;
            }
        }
        System.out.println(maxx);
        System.out.println("=============================");
        String[]arr3={"1","2.5","3","3.5","4.5"};
        double[] numbers=new double[arr3.length];//[0.0,0.0,0.0,0.0]
        for(int i=0;i<arr3.length;i++){
            numbers[i]=Double.parseDouble(arr3[i]);//repeat step
        }


        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));//After sort
        System.out.println(numbers[numbers.length-1]);//max index
    }
}
