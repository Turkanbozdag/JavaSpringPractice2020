package Day25_MethodRecap;

import Resources.Library;

public class Frequency {
    public static void main(String[] args) {


        String str = "javajavajavajava";
        String str2="java";


        String NonDup=Library.RemoveDuplicates(str);
        String result="";
        for( int i=0; i<NonDup.length();i++) {
            String ch = "" + NonDup.charAt(i);//"A"//sayilari degisiyo a b c kacincida
            int num = Library.Frequency(str, ch);
            result+=ch+num;
            //System.out.println(ch + num);
        }
        System.out.println(result);

            int count=0;

        while (str.contains(str2)) {
            count++;
            str.replaceFirst(str2,"");
        }
        System.out.println(str);
        System.out.println(count);
        String a="python python python";
        String b="python";
        int num1=Frequency(a,b);
        System.out.println(num1);
    }
    public static int Frequency(String str1,String str2){
        int count=0;
        while (str1.contains(str2)) {
           count++;
            str1=str1.replaceFirst(str2,"");//we need to make that we are not counting the same index over again

        }
        return count;

    }
}


