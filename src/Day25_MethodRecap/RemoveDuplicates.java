package Day25_MethodRecap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="ABAB";
        String result="";//1 exe A secon B 3.executed
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (!result.contains(""+ch)){
                result +=ch;
            }
        }

        System.out.println(result);




    }
    public static String removeduplicates(String str){
        String result="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (!result.contains(""+ch)){
                result+=str.charAt(i);
            }

        }
        return result;
    }


}
