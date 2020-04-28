package calis;

import javax.security.auth.callback.LanguageCallback;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_formating {
    public static void main(String[] args) {
        //days_month_year
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMM/yy");
        LocalDate date1= LocalDate.now();
        System.out.println(date1.format(dtf));

        /*creat adate called birthday:patter====>months/days/year

         */
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEE MMM/dd/yy");
        LocalDate date2=LocalDate.of(2013,01,26);
       String str1= date2.format(dtf2);
        System.out.println(str1);
       // System.out.println("\"happy birthday canim ilk goz agrim VILDANIMMMM\"");









    }
}
