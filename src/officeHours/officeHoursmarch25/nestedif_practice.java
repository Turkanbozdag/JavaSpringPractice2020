package officeHours.officeHoursmarch25;

public class nestedif_practice {
    public static void main(String[] args) {
        byte weekdays = 8;
        boolean validnumber = weekdays > 0 && weekdays < 8;
        String result = "";
        if (validnumber) {
            if (weekdays == 1) {
                result = "monday";
            } else if (weekdays == 2) {
                result = "tuesday";
            } else if (weekdays == 3) {
                result = "wednesday";
            } else if (weekdays == 4) {
                result = "thursday";
            } else if (weekdays == 5) {
                result = "friday";
            } else if (weekdays == 6) {
                result = "saturday";
            } else if (weekdays == 7) {
                result = "sunday";
            } else {
                result = "invalid";
            }


            System.out.println(result);


        }
    }
}