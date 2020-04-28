package Day28_DateTime;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time1= LocalTime.now();
        System.out.println(time1);
        System.out.println("=======================");
        LocalTime time2=LocalTime.of(9,30,45);
        System.out.println(time2.format(dtf));
        System.out.println("=========================");
        LocalTime time3=LocalTime.of(10,0);
        System.out.println(time3.format(dtf));
        //pm icin 12 den sonrakiler pm cikar
        LocalTime time8=LocalTime.of(23,34);
        System.out.println(time8.format(dtf));
        System.out.println("==========");
        LocalTime time7=LocalTime.of(10,00);
        System.out.println(time7.format(dtf));
        boolean result=time1.isAfter((time7));
        System.out.println(result);






    }
}
