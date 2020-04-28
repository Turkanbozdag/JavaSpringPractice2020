package Day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    public static void main(String[] args) {
        String[]friends={"vildan","mesut","rumeysa"};
        LocalDate vildanBirtday=LocalDate.of(2013,01,26);
        LocalDate mesutBirthday=LocalDate.of(2014,07,04);
        LocalDate rumeysaBirthday=LocalDate.of(2016,02,11);

        LocalDate[]birthdays={vildanBirtday,mesutBirthday,rumeysaBirthday};
        for (int i=0;i<friends.length;i++){
            String name=friends[i];
            LocalDate bd=birthdays[i];
            System.out.println(name+"'s birthday is "+bd);
        }



    }
}
