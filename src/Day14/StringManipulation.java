package Day14;

public class StringManipulation {
    public static void main(String[] args) {
        String str=" I like to learn java. I like to watch bthe movie jumanji";
        int a1=str.indexOf("j");//first the index num of first matching
        System.out.println(a1);

        int a2 =str.indexOf("Jum");
        System.out.println(a2);

        int a3=str.indexOf(" I")+1;//second I index number
        System.out.println(a3);

        String s="I Like java ,and I Like reading";
        int b1 =s.lastIndexOf("I");
        System.out.println(b1);

        int b2=s.lastIndexOf("L");
        System.out.println(b2);

        String z="I Like C#,C# is cool";
        int c1=z.lastIndexOf("C");
        System.out.println(c1);

        String x="L like Java,Java is fun, Java parogramming is fun";
        int d1=x.indexOf("Java is");//second J
        System.out.println(d1);

        int d2=x.indexOf(", J")+2;//forst one
        System.out.println(d2);

        int d3=x.lastIndexOf("J");//last one
        System.out.println(d3);

        int d4=x.indexOf("java p");//last j index number
        System.out.println(d4);

        char ch1=x.charAt(26);//numarasini bildigimizi getiryoz
        System.out.println(ch1);


    }
}
