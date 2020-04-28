package day05;

public class postPre {
    public static void main(String[] args) {
        //pre changes value of variable immediately
        int a=100;
        System.out.println(++a); //100
        System.out.println(a); //100
          int b =100;
        System.out.println(--b);//99
        System.out.println(b);//99

        //post first passes the cyrrent value the eventually chnages the variable value

        int A=100;
        System.out.println(A++);//100
        System.out.println(A);//101
        int B=100;
        System.out.println(B--);//100
        System.out.println(B);//99


        //post & pre examples:
        int x=10;
        int y=++x;
        System.out.println(y);
        System.out.println(x);

        int s=10;
        int f=s++;
        System.out.println(f);//10
        System.out.println(s);

        double t1=3.5;
        double t2=t1--;
        System.out.println(t2);
        System.out.println(t1);


        int w=35;
        int x4=w;
        System.out.println(w++);
        System.out.println(w);
        System.out.println(w--);
        System.out.println(w);

        int l=50;
        l=--l+ l++ + l--+ l++;//49 49 50 49=197

        // Homework
        int h =1;
        h=-h--+h++/-h--*--h;
        //-1+0/-1*-1


        System.out.println(-h--);//197
        System.out.println(h++);//198
        System.out.println(-h--);//198
        System.out.println(--h);
        System.out.println(h);


        System.out.println(h);




        System.out.println();








    }
}
