package Day26_Methodoverloading;

public class MethodOverloading3 {
    /*first method:can find the sum of twoo int numbers
    second method:can find the sum of two double numbers
     */
    public static void main(String[] args) {
        sum(10, 20);
        sum(1.5, 2.5);
        // 10,15.5
        double num1 = sum(10, 15.5);
        System.out.println(num1);
        //25L,30L
        double num2 = sum(25L, 30L);
        //5,4
        //double num3=sum(5,4);//void method doesnot return any value
        //40L,50L
        sum((int) 40L, (int) 50L);
    }

    public static double sum(int a,int b) {//in method oveloading,return type does not matter
        System.out.println(a+b);
        return sum(a,b);
    }




    ///rturn type double voidde kala bilir parantezle esit olmak zorunda degil
    public static double sum(double a,double b){//return type does not matter
        System.out.println(a+b);
        return a+b;

    }
}

