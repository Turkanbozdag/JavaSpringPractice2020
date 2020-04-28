package warmupTask;

public class deney {
    public static void main(String[] args) {


        String a="today is wednesday and weather is good";
        int b=a.indexOf("we");
        System.out.println(b);

        String A="Cybertek school,School is our home";
        int B=A.lastIndexOf("e");
        System.out.println(B);
        System.out.println("========================");
        String t="          ";
        boolean f=!t.isEmpty();
        System.out.println(f);
        System.out.println("================");
        String s1="cat";
        String s2=new String("cat");
        String s3="Cat";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equalsIgnoreCase(s1));
        String p="";
        System.out.println(p.isEmpty());
        System.out.println("==================");
        String sentence="I like to learn java";
        System.out.println(sentence.contains("java"));

        String firstname="cybertak";
        String lastname="batch18";
         firstname=firstname.substring(0,1);
         lastname=lastname.substring(0,1);
        System.out.println(firstname+lastname);










    }
}
