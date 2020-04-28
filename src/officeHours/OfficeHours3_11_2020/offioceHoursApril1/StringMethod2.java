package officeHours.OfficeHours3_11_2020.offioceHoursApril1;

public class StringMethod2 {
    public static void main(String[] args) {
        //isempty():checks is the string is e,pty,returns boolean
        String str1=" ";
        boolean r1=str1.isEmpty();//false
        boolean r2=!str1.isEmpty();//true
        System.out.println(r1);
        System.out.println(r2);

        //equals(str):
        String s1="cat";
        String s2=new String("cat");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true visiable yreleri gosteriyo
        System.out.println("=============");
        //charAt(indexnumber):returns the char at then given index char primitive
        String r="Java ";
        char ch1=r.charAt(3);
        System.out.println(ch1);
        char ch2=str1.charAt(4);
        System.out.println(ch2);
        String A="Cybertek School";
        int total=A.length();
        System.out.println(total);








    }






}

