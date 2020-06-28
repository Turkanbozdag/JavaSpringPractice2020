package Codiiiin;

public class Emails {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};
        for (String eachemail : emails) {


            if (eachemail.endsWith("@gmail.com")) {
                continue;
               // System.out.println(eachemail);
            }
            System.out.println(eachemail);
        }
    }
}