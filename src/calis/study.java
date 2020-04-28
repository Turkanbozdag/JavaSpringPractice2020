package calis;

public class study {
    public static void main(String[] args) {
        String str ="ABABC";
        String result="";//",store the enique

        int count=0;//to count the occurence of the character
        for (int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if (ch == 'A') {

                count++;
            }
        }

        if (count==1){
            result+='A';
        }
        System.out.println(count);
        System.out.println(result);




    }
}
