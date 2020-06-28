package PRACTICEEEEE;

public class DaysInMonth {
    public static void main(String[] args) {
        //30 days:4,6,9,11
        //28 days:2
        //31 days:1,3,5,7,8,10,12

        byte month=0;
        boolean days28=month==2;
        boolean days30=month==4 || month==6 || month==9 || month==11;
        boolean days31=days28==false && days30==false;

        if (days28){
           System.out.println("it has 28 days");

        }
        if (days30){
            System.out.println("it has 30 days");
        }
        if (days31){
            System.out.println("it has 31 days");
        }









    }
}
