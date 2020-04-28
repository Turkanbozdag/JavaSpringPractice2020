package day05;

public class primitiveCasting {
    public static void main(String[] args) {
        //implicit casting:done automatically
        int a=10;
        long b=a;// 10L implicit casting is done  automatically
        System.out.println(b);

        int a1=100;
        long b1=(long)a1;
        System.out.println(b1);
        //int c1=b1; lon>int
        // explicit casting
        int Inum=100;
        byte bnum=(byte)Inum;
        System.out.println(bnum);

        //int inum=100;
        //byte Bnum=(byte)inum;
        //short Snum=(int)inum;
        double dnum=5.5;
        float fnum=(int)dnum;
        System.out.println(fnum);

        double D1=10.5;
        long L1=(int)(D1);
        System.out.println(L1);
        int Inu=9;
        byte BY=(byte)Inum;
        System.out.println(BY);







        }
}
