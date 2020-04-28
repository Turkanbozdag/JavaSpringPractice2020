package Day24_method;

public class returnMethods {
    public static void maxnum(int a, int b) {
        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {


        //int a=maxnum(a:10, b:20);
      int result=  Addition(1000,2000);
        System.out.println(result);//3000
        int result2=result+2000;
        System.out.println(result2);//5000
    }
    public static int Addition(int a,int b){
        //System.out.println(a+b);//30bu dsatiri cancel
        return a+b;
    }
}
