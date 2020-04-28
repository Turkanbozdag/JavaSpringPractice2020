package Day13;

import sun.text.resources.CollationData;

public class StringManipulation2 {
    public static void main(String[] args) {
        String str="Cybertek school is the best";

        String schoolname=str.substring(0,8);
        System.out.println(schoolname);

        String fullname="Mahmut Muhtar";
        //               01234567891011
        String firstname=fullname.substring(0,6);//bir fazlasini yazacaz
        String lastname=fullname.substring(7,11+1);
        System.out.println(firstname);
        System.out.println(lastname);

        String Murtaza="Murtaza nazeeri";

        String Firstname=Murtaza.substring(0,6+1);
        String lasstname=Murtaza.substring(8,14+1);
        System.out.println(firstname);
        System.out.println(lastname);
        //String gmail=lasstname.concat("-").concat(firstname).concat("@gmail.com");

        String gmail=lasstname+"-"+firstname+"@gmail.com";
        System.out.println(gmail);

        String s1="I love java Programing Language";
        //         01234567

        String classname=s1.substring(7);
        System.out.println(classname);

        String s2="I like C# Programming";
       s2= s2.replace( "C#","java");
        System.out.println(s2);

        String name="Covid 18";
        name=name.replace("8","9");
        System.out.println(name);

        String r1="I like c#,c# is fun, c# is cool";
        r1=r1.replace("c#","java");
        System.out.println(r1);

        String r2="l lke c# ,c#is fun c# is cool";
        r2=r2.replaceFirst("c#","java");
        System.out.println(r2);//differentten top


        String r3="tomorrow is monday ,tomorraw tuesday";
        r3=r3.replaceFirst("tomorrow","today");


















    }
}
