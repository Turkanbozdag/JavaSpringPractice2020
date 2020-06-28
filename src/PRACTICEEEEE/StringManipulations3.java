package PRACTICEEEEE;

public class StringManipulations3 {
    public static void main(String[] args) {
        String str="I like Java Programming john";
        int num=str.indexOf("John");
        System.out.println(num);

        String str2="Cybertek school is awesome";
        int first=str2.indexOf("is")+1;
        System.out.println(first);

        int maxindexnumber="Cybertek".length()-1;//total number of character
        System.out.println(maxindexnumber);

        String names="turkan";
       int a1= names.indexOf("Good gril");
        System.out.println(a1);

        String fullname="Vildan Kuzum";
        String firstname=fullname.substring(0,fullname.indexOf(" "));//first boslugu
        String lastname=fullname.substring(fullname.indexOf(" ")+1);
        System.out.println(firstname);
        System.out.println(lastname);
        String full="Abdullah mesut";
        String firt=full.substring(0,full.indexOf(" "));
        String last=full.substring(full.indexOf(" ")+1);
        System.out.println(firt);
        System.out.println(last);






    }
}
