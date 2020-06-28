package Practice_05_06_2020.Day2_StringAnLoop;

public class palindrome {
    public static boolean ispalindrome(String str){
        str=str.toLowerCase();
        //racecar
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            return false;
            }
        }
        return true;
    }
}
