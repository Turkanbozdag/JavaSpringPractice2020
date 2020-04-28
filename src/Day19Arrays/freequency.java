package Day19Arrays;
/*
 write a program that can return the frequency of the characters ina string

        Ex: "AABCBCA" ==> "A3B2C2"

    Hint: You need nested loops
 */
public class freequency {
    public static void main(String[] args) {
        String str="AABCC";//AsB1C2 frequency bu sayi
        String result="";//"A2B1C2
        String nondup="";//AB
        String nonduplicates="";//ABC
        for (int i=0; i<=str.length()-1;i++){
            if (!nonduplicates.contains(""+str.charAt(i))){//if the character at index i is not contained in nondup,then it
    nondup+=str.charAt(i);
            }
        }
        //System.out.println(nondup);
        int count=0;//count the tota; number of occurence of each charcter fromstr
        for (int i=0; i<=str.length()-1;i++){
            if(str.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println(count);








    }
}
