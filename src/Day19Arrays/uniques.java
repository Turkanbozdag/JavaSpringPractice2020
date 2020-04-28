package Day19Arrays;

import java.util.Scanner;

/*write a program that can return the unique characters from a string

        Ex:  "AABCC" ==> "B"

 */
public class uniques {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        String str=input.nextLine();
        String result="";//"C"
            //String str="AABCC";//kac defa varsa okadar for loop donecek
            //String result="";//"B
       // int count=0;
        for (int j=0;j<=str.length()-1;j++){
            //if (str.charAt(i)=='A'){
                char ch2=str.charAt(j);
               int count =0;//cracter
                for(int i=0;i<=str.length()-1;i++){
                    char ch=str.charAt(i);
                    if (ch==ch2){
                        count++;
                    }
                }

        if (count==1) {              //if unique
            result += ch2;//result += str.charAt('A');
        }
        }
        System.out.println(result);
        //System.out.println(count);





    }
}
