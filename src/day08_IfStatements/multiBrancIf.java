package day08_IfStatements;

public class multiBrancIf {
    public static void main(String[] args) {
        int a=100;
      /*
        boolean zero=a==0;
        boolean negative=a<0;
        boolean positive=a>0;
        */
        /*single if i use
        if (zero){
            System.out.println("zero");
        }
        if (negative){
            System.out.println("negative");
        }
        if (positive){
            System.out.println("positive");
        }*/

        if (a==0){
            System.out.println("zero");
        }else if(a>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }











    }









}