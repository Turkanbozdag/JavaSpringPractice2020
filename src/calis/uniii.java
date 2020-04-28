package calis;

public class uniii {
    public static void main(String[] args) {
        String str = "ABBBBBBCCDBF";
        String result = "";//A
        for (int i = 0; i < str.length(); i++) {//burasi uniqeleri buluyor


            //A
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);//buraya kadar
            }
        } // return result;


    }
    public static void uniii(String str){
        String result="";
        for (int i=0;i<str.length();i++){
            int num=frequency(str,str.charAt(i));
            if (num==1){
                result+=str.charAt(i);
            }
        }

    }
    public static int frequency(String str,char ch){
        char[]arr=str.toCharArray();//[A,B,B]
        int count =0;//1
        for (char each:arr) {//3 each:A,B,B
            if (each == ch) {
                count++;
            }

        }
        return count;
    }

}
