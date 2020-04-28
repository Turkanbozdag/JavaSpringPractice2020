package day06;

public class warmup {

    public static void main(String[] args) {

        double  numberofgallon=3.785;
        double galonstolitre=numberofgallon*3.785;
        String result=numberofgallon+"  is equal to: "+ galonstolitre+ "  liters";

        System.out.println(result);
        System.out.println("=========================");
        double numberofliter=1;
        double litertogallon=numberofliter/3.785;
        String result2 = numberofliter+" liter equal to "+litertogallon+" galon";
        System.out.println(result2);

        System.out.println("============================================");

        int a=200;
        int b=-a++ + - --a*a--%2;
        // b=-200+-200*200%2
        //-200 +-40000 %2
        //-200+0
        System.out.println(b);
        System.out.println(a);





        /*int YY=200;
        System.out.println(-YY++);//-200
        System.out.print(- --YY);//-199
        System.out.print(YY--);//199
        //int rem=200-()
       // System.out.println(-YY++ + - --YY*YY--%2);
        */
        int x=300;
        int y=400;
        int z=x+y-x*y+x/y;
        //z=300+400-300*400+300/400
        //z=300+400-120000+300/400
        //z=300+400-120000+0 =====>300/400====>0.75 int takes 0 zero
        //700-120000=-119300
        System.out.println(z);





















    }





}
