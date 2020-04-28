package officeHours.Practice_04_22;

public class return_Method {
    public static void main(String[]args){
       // int a=sum(10,20);
        int num1=sum2(10,20);
        System.out.println(num1);
        System.out.println("================");
        String str="cybertek";
        String result="";
        for (int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);


            System.out.println(result);


            String name="bank of America";//pano pragram
            String name2=reverse(name);
            System.out.println(name.equals(name2));
        }
    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static int sum2(int a,int b){
        return a+b;
    }
    public static String reverse(String str){
        String result="";
        for (int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        return result;

    }
}
