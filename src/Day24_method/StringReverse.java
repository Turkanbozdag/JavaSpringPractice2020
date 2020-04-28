package Day24_method;

public class StringReverse {
    public static void main(String[] args) {
//String t=Reverse("cybertek");

    String name=Reverse2("Cybertek");
        System.out.println(name);
}
public static void Reverse(String str){
        String Reverse="";
        for (int i=str.length()-1;i>=0;i--){
           Reverse+= str.charAt(i);

        }
    System.out.println(Reverse);
}
public static String Reverse2(String str){//return me str
        String Reverse="";
        for(int i=str.length()-1;i>=0;i--){
            Reverse +=str.charAt(i);
        }
        return Reverse;

}
  }

