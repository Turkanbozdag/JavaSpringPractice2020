package Day16Loop;

public class EnglishAlphabet {
    public static void main(String[] args) {
        for(char ch='A';ch<='Z';ch++){
            System.out.println(ch+" ");
        }
        for (char ch='Z';ch>='A';ch--){
            System.out.print(ch+" ");
        }
        System.out.println();
        for (char ch='a'; ch<='z';ch++){
            System.out.println(ch+" ");
        }
        System.out.println();
        int s='A';
        System.out.println(s);

        String upperCase="";//A~z
        String lowerCase="";//a~z
        for (char ch='A';ch<='Z';ch++){
            upperCase +=ch;
        }
        System.out.println(upperCase);
        for(char ch='a'; ch<='z';ch++){
            lowerCase +=ch;
        }
        System.out.println(lowerCase);
        //Aa Bb Cc Dd...
        String result="";
        for (int i=0; i<= upperCase.length()-1;i++){
            result +=upperCase.charAt(i)+""+lowerCase.charAt(i)+" ";

        }
        System.out.println(result);

        //second solution
        int a=97;
        int A=65;
        String result2="";
        for (int i=0;i<26;i++) {
            char ch = (char) (A + i);//upper case characters
            //              65
            char ch2 = (char) (a + i);
            //              97+0
            result2 += ch + " " + ch2 + "";

            System.out.println(result2);
        }



    }
}
