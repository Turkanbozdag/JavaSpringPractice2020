package PRACTICEEEEE;

public class study {
    public static void main(String[] args) {
        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("++++++++++++++++++++++++++");
        String gmail = "cybertekschool@gmail.com";
        String userinputGmail = "cybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail);//false

        if (result) {
            System.out.println("Logged in");

        }
        String s1 = "Cybertek School";
        boolean t1 = s1.contains("School");//false
        System.out.println(t1);
        System.out.println("&&&&&&&&&&&&&&&&&&&&");

        String password = "mmasd 1235";
        if (password.contains(" ")) {
            System.out.println("password cannot have space in it");
        } else {
            System.out.println("valid password");
        }
        System.out.println("???????????????????????????????//////");
        String s3 = "United States";
        System.out.println(s3.startsWith("S"));//true

        System.out.println("((((((((((((((((((((((((((((((((((");
        String webAddress = "Www.amazon.on.com";
        // webAddress=webAddress.toLowerCase();

        if (webAddress.startsWith("www.")) {
            System.out.println("valid");
        }


        String ss = "cybertek school";
        System.out.println(ss.endsWith("l"));
        System.out.println(ss.endsWith("school"));

        System.out.println(ss.endsWith("cybertek"));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        /*
        every single gmail address ends with @gmail.com
         */
        String email = "CybertekSchool@yahoo.com";
        if (email.endsWith("@gmail.com")) {
            System.out.println("valid gmail");
        } else {
            System.out.println("invalid mail");
        }

        /*
        write a program that can validate if web address is valid
        must start with www.must endswith.com,or edu.net,gov
         */
        String website = "WWW.cybertek.Gov";
        website = website.toLowerCase();

        boolean validending = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov");

        if (website.startsWith("www")) {
            System.out.println("valid:started with www");

            if (website.endsWith("www") && validending) {


            }


        }
    }
}
