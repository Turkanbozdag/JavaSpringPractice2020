package Day17_WhileLoop;

public class palindromeTest {
    public static void main(String[] args) {
        String str="Java";
        String reversedStr="";//store the reversed version of str
       int index= str.length()-1;//last index number
        while (index>=0){
            str.charAt(index);
            index--;
        }
        boolean palindrome=reversedStr.equalsIgnoreCase(str);
        System.out.println(reversedStr);



    }
}
