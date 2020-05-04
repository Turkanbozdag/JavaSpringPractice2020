package WrmUpmay4;

import java.util.ArrayList;

/*write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}

 */
public class ExtractChars {
    public static void main(String[] args) {

String str="ABCD123$%#@&456EFG!";
char[]arr=str.toCharArray();//charcter icin
        ArrayList<Character>letters=new ArrayList<>();
        ArrayList<Character>digists=new ArrayList<>();
        ArrayList<Character>specilChars=new ArrayList<>();
        //arr collection
        for(char each:arr){
            //isAlphabetic(each)
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
