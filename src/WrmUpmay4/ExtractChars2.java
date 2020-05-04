package WrmUpmay4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class ExtractChars2 {
    public static void main(String[] args) {
        String str="ABCD123$%#@&456EFG!";

        ArrayList<Character> letters=new ArrayList<>();
        ArrayList<Character>digists=new ArrayList<>();
        ArrayList<Character>specilChars=new ArrayList<>();
        for(int i=0; i<str.length();i++) {
            char each = str.charAt(i);
            if (Character.isLetter(each)){
                letters.add(each);
            }else if (Character.isDigit(each)){//burasi []digit doldurmak icin yazilan satir
                digists.add(each);
            }else{
                specilChars.add(each);//we get here specilachar

            }
        }
        System.out.println(letters);
        System.out.println(digists);
        System.out.println(specilChars);

    }
}
