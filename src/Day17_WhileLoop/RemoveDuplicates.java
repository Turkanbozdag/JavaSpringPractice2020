package Day17_WhileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="java java java java  java";//abcd
        String noneDuplicated="";
        String result="";
        //int i=0;
              int count=0;
              String word="j".toLowerCase();// while (!result.contains(""+str.charAt(i))){//while result
        while (str.contains("java")){
            count++;
            str=str.replaceFirst("java","");
        }

        System.out.println(count);





    }
}
