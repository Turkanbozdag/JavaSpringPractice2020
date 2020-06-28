package Codiiiin.nighttask;
/*
AABCBCA==>A#B@C@
 */

public class frequency {
    public static void main(String[] args) {
        String str="AABCC";//A2B1C2
        String result="";

        String nonDuplicates="";//ABC

        for (int i=0;i<=str.length()-1;i++){
            if (!nonDuplicates.contains(""+str.charAt(i))){
                nonDuplicates +=str.charAt(i);

            }
        }
        //int count=0;//count the total number of occurence of each charcter from str
        System.out.println(nonDuplicates);
    }
}
