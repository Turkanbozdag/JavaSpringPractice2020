package day05;

public class LeapYear {
    public static void main(String[] args) {


        //boolean result1=true;
        //boolean result2=false;
        //int result3=2020;
        int year=2020;
        // leap year:year%4==0
        boolean leapyear=year%4==0;

        System.out.println(year+"is leep year :"+leapyear);
        String result= year+"is leap year:"+leapyear;
        System.out.println(result);


    }



}
