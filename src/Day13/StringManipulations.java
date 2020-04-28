package Day13;

public class StringManipulations {
    public static void main(String[] args) {


String str="Cybertek";
//          01234567

        char ch1=str.charAt(5);//t veriri A yazdirmaz
        System.out.println(ch1=='A');// because why false

        System.out.println(ch1=='T');
        //                  t=='T' why <==false

        int totallenght=str.length();//returns th total number of caraccter as int
        System.out.println(totallenght);

        System.out.println(totallenght>250);//false
        String str2="Today is great day, java is fun";//index number

        int maxinnum=str2.length()-1;
        System.out.println(maxinnum);//30 cikti bir fazlasi index numarasi

        String s1="Cybertek";//
     s1=   s1.concat("school");//print cybertek s1= yapinca represent cybertek schol
        System.out.println(s1);

        String s2="java";
        s2.concat("is a programming languages");//this print java is a programinlanguages


        System.out.println(s2);

        s2=s2.concat("is a programming language");//now print whole
        System.out.println(s2);

        String r1="java";
        r1=r1.concat(", and it is easy");
        System.out.println(r1);
        String name1="Cybertek";
        name1=name1.toLowerCase();
        System.out.println(name1);
        String name2="cybertek";
        name2=name2.toUpperCase();
        System.out.println(name2);

        String A1="          Today is great day";
        A1=A1.trim();
        System.out.println(A1);



    }
}
