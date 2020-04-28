package calis;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, 10, 25);

        System.out.println(date1);
        LocalDate birthday = LocalDate.of(2020, 12, 25);
        System.out.println(birthday);
        //isbefore(date2)
        boolean result = date1.isBefore(birthday);
        //isAfter(date2)
        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);
        //equal(date2)
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);
        //is leap year
        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);
        LocalDate now = LocalDate.now();//2020-04-23
        System.out.println("taday is:" + now);

        LocalDate birtday = LocalDate.of(1990, 04, 25);
        int month = birtday.getMonthValue();
        int days = birtday.getDayOfMonth();

        String str = now.toString();
        System.out.println(str.replace("-", ""));
        //month/day/year


    }
}
