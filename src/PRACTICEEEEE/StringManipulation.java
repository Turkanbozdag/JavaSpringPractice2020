package PRACTICEEEEE;

public class StringManipulation {
    public static void main(String[] args) {
        String str="Cybertek Schooll is the best";
        String schoolname=str.substring(0,8);
        System.out.println(schoolname);

        String fullname="mahmut muhtar";
        String firstname=fullname.substring(0,6);
        String lastname=fullname.substring(7,13);
        System.out.println(firstname);
        System.out.println(lastname);//full name=firstname lastname
        //gmail:lastname_firstname@gmail.com

        String Murtaza="rumeysa Nazeeri";
        String firstnaame=Murtaza.substring(0,7);
        String lastnaame=Murtaza.substring(8,15);
        System.out.println(firstnaame);
        System.out.println(lastnaame);

       // String gmail=lastnaame.concat("_").concat(firstnaame).concat("@gmail.com");
        String gmail=lastnaame+"_"+firstnaame+"@gmail.com";
        System.out.println(gmail);

        String s1="I Love java Programmin Language";
        String classname=s1.substring(7);
        System.out.println(classname);
        System.out.println("*************************");
        String s2="I like C# programming C# C#";
        s2=s2.replace("C#","java");
        System.out.println(s2);

        String name="COVID 18";
        name=name.replace("8","9");
        System.out.println(name);

        String r1="I Like C#,C# is fun,C# is cool";
        r1=r1.replaceFirst("C#","Java");
        System.out.println(r1);

        String r2="Tomorrow is monday,Tomorrow is tuesday";
        r2=r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);









    }
}
