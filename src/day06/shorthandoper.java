package day06;

public class shorthandoper {
    public static void main(String[] args) {
        int x=20;
        x +=10;//x=x+10=30
        System.out.println(x);
        x+=60;
        System.out.println(x);
        String schoolname=" cybertek";
        schoolname+=12345;
        System.out.println(schoolname);
        System.out.println('a'+'b');//97+98==195
        char ch1='a';//97
        ch1+='b';//98
        System.out.println(ch1);

        int num='z';//num=122
        num+='x';//num=num+120
                //result will be num=num+120=242
        System.out.println(num);


       // int b=30;
        //int b =5;
        //System.out.println(c);
        int A= 100;
        A-=90;
        System.out.println(A);
        int B=200;
        B-=10;
        System.out.println(B);
         int a=2;
         a*=3;
        System.out.println(a);
        int b= a*=10;
        // b=a=a*10=60
        System.out.println(b);
        System.out.println(a);
        int a1=100;
        int b1=(a1*=2)+ ++a1;
        // b1=200+201=401
        System.out.println(b1);
        int x1=10;
        int y=x1+=10*2;// x1=x1+20
        //x1+=20===>30
        int q=20;
        int p=q*=20*3;//q*=60;//

        System.out.println(p);
        int D=300;
        D/=2;// D=D/2
        System.out.println(D);
        int num1 =400;
        num1 /=20+10;//num1=num1/20+10
        System.out.println(num1);

        int R=100;
        R%=10+20;//===>R%=30
                    // num=300%30===>0// remainder not negative any time
        System.out.println(R);
        int num6=400;
        num6%=3*5;//num6 %=15
                    //n6=n6%15
        System.out.println(num6);//400/15=26.666
                                // remainder=400-(15*26)//remainder cannot be negative














    }




}
