package Day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime time1=LocalTime.of(9,40,10);
        System.out.println(time1.format(dtf));
        LocalTime time2=LocalTime.of(12,40,20);


        LocalDate date=LocalDate.of(2020,3,20);
        LocalTime time=LocalTime.of(11,30,30);
        LocalDateTime dateTime=LocalDateTime.of(date,time);
        System.out.println(dateTime);
       // LocalDateTime dateTime2=LocalDateTime.of(2020,4,27,2,22,22,);



    }
}
