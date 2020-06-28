package Codiiiin;

public class Logest_Shortest_words{
    public static void main(String[] args) {
        String[] names={"Emir","turkan","vildan","Abdullah","Azra"};
        int maxLengthstring=names[0].length();//4
        int minlengthString=names[0].length();

        String longestword="";
        String shortword="";

        for (int i=1;i<=names.length-1;i++){
            if (names[i].length()>maxLengthstring){
                maxLengthstring=names[i].length();
                longestword=names[i];
            }
            if (names[i].length()<minlengthString){
                minlengthString=names[i].length();
                shortword=names[i];
            }


        }
        System.out.println(shortword);
        System.out.println(longestword);
    }






}
