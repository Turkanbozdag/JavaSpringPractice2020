package calis;

public class palindrome {
    public static void main(String[] args) {
        palindrome("level");

    }
    public static void palindrome(String str){//abcd
        String reversed="";
        for (int i=str.length()-1;i>=0;){
            reversed+=str.charAt(i);
        }
        System.out.println(str.equals(reversed));
    }
}
