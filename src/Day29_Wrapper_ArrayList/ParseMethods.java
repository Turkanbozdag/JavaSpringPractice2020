package Day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str="123";
       int a1= Integer.parseInt(str);
        System.out.println(str+1);//text====>"1231"
        System.out.println(a1+1);//number
        byte a2=Byte.parseByte(str);//byte =123
                        //123+1
        System.out.println(a2);// it is number
        Integer I1=(int)Byte.parseByte(str);//AutoBoxing
        //Integer=(int)byte;
        //Integer=int;
        String str2="10.5";
        float f1=Float.parseFloat(str2);//returns float 10.5
        System.out.println(f1+1);
        double f2=Double.parseDouble(str2);//double 10.5
        System.out.println(f2+1);

        String str3="99999999999";
        double num1=Long.parseLong(str3);
        System.out.println(num1+2);
        Long num2=Long.parseLong(str3);
        System.out.println(num2+2);
       // String result1="true";
        String result1="taday is monday";//not true or false====>return false
        boolean a=true;
        boolean r1=Boolean.parseBoolean(result1);
        System.out.println(!r1);
        String result2="false";
        boolean r2=Boolean.parseBoolean(result2);
        System.out.println(r2);





    }
}
