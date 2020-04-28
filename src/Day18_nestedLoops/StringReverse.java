package Day18_nestedLoops;

public class StringReverse {
    public static void main(String[] args) {
        String str="Java";
        String rev="";
        int lastIndex=str.length()-1;//last index numbere bulunur bu satirla
        do{
            rev+=str.charAt(lastIndex);
            lastIndex--;


        }while(lastIndex>=0);
        System.out.println(rev);






    }
}
