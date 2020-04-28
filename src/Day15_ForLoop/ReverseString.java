package Day15_ForLoop;

public class ReverseString {
    public static void main(String[] args) {

        String str="java";
        String reverse1=""+str.charAt(3)+str.charAt(2)+str.charAt(1+str.charAt(0));

        int lastindexnum=str.length()-1;
        String reverse2="";
        for(int i=lastindexnum;i>=0;i--){
            reverse2 +=str.charAt(i);

        }
        System.out.println(reverse2);


    }
}
