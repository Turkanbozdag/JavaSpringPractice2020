package calis;

public class kim {
    public static void main(String[] args) {
       double a=100;
       double b=200;
       double c=400.5;
       boolean amin=a<b && a<c;//true
       boolean bmin=b<a && b<c;//f
       boolean cmin=c<a && c<b;//fa
       if (amin){
           System.out.println(a+" is min num");
       }
       if (bmin){
           System.out.println(b+" min number");

       }
       if (cmin){
           System.out.println(c+" is min");
       }
       // a:if(a<b &&a>c)or(a>b && a<c)
        boolean amedium=(a<b && a>c)|| (a>b && a<c);
       boolean bmedium=(b<c && b>a)|| (b>c && b<a);
       boolean cmedium=(c<b && c>a)||(c>b && c<a);
       if (amedium){
           System.out.println(a+"is the medium");
       }
       if (bmedium){
           System.out.println(b+"is the medium");

       }
       if (cmedium){
           System.out.println(c+"is the medium");
       }



    }
}
