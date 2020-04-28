package day06;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Ifstatementspractice {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        if (a>b){//false kesinlikle cikmaz execuded:))
            System.out.println(a+ "  is greater than "+b);
        }
        if (b>a){


            System.out.println(b+" is greater than "+a);
        }
        if (a==b){
            System.out.println(a+" is equal to" +b);//a you can write
        }


        System.out.println("=====================================");
        int x=200;
        int y=300;
        boolean xgreater=x>y;
        boolean ygreater=y>x;
        if (xgreater){
            System.out.println(x+"  is greater than"+y);

        }
        if (ygreater){
            System.out.println(y+"  is greater than x" +x);

        }
        if (xgreater== false&& ygreater==false){
            System.out.println(x+"is equal to "+y);
        }
        if (!xgreater &&!ygreater){
            System.out.println(x+" is equalto"+y);
        }





char mn='a';
        System.out.println(mn);
        char nn='5';
        System.out.println(nn);
        char mm=55555;
        System.out.println(mm);
        System.out.println('3'+3);
        System.out.println("3"+'3');



        int D=10;
        int G=x++;
       // System.out.println(y+++""+x++ +" "+y);

        System.out.println(D++);
        System.out.println(G++);
       // System.out.println(G+);


    }


}




