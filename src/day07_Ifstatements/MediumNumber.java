package day07_Ifstatements;
/*4. write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)

 */
public class MediumNumber {
    public static void main(String[] args) {
        double a=100;
        double b= 200;
        double c=50;
        /*(if a is less then b) a<b &&a>c or a>b && a<c
        if b<c && b>a Or b>c&& b<a
        if c<b &&c>a Or c>b&& c<a
         */
        boolean amedium=(a<b && a>c)||(a>b && a<c);//b<a<c
        boolean bmedium=(b<c && b>a)|| (b>c && b<a);//c<b<a
        boolean cmedium=(c<b && c>a)|| (c>b && c<a);// or use because c<b and c>b can not

        if (amedium){

            System.out.println(a+" is the medium number");
        }
        if (bmedium){
            System.out.println(b+" is medium");
        }
        if (cmedium){
            System.out.println(c+ "medium");
        }






    }






}
