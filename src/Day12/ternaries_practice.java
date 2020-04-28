package Day12;

import java.util.Scanner;

public class ternaries_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("enter code:");
        int statuscode = scan.nextInt();

        String result = "";

        if (statuscode == 200) {
            result = "ok";
        } else if (statuscode == 201) {
            result = "created";

        } else if (statuscode == 202) {

            result = "accept";
        } else {
            result = "invalid";

        } System.out.println(result);






    }
}
