package day06;

public class logicalOp {
    public static void main(String[] args) {
        boolean result1=true;
        System.out.println(!result1);// false
        boolean result2=!(10+15>15);//false
        System.out.println(result2);
        boolean result3=!true== !false;// ayri hesaplaniyo sag ve sol taraf
                            //false==true//false

        boolean R1="corono Virus"!= "end of the world" && "Toilet paper"=="cure";
                    //true                                     false result false
         boolean r2= 10>15 && 15<13;
                        //false false
        System.out.println(r2);
        boolean r3 ='a'=='b'-1&& 'b'+1=='c';
                //   97==98-1 &&  98+1=99===>true
       boolean ans =8>4||9<1;
        System.out.println(ans);
        boolean r5=true!= false|| false==!true;
        System.out.println(r5);
        boolean r6=!false && false==!true;
        System.out.println(r6);// tre&false false
        boolean t4=!!!!false;
        System.out.println(t4);// !! true// even numara !!verirsen kendine doner// odd verirsen!!!oppostie tersi
        //!false//true
        boolean M=true||false;
        System.out.println(M);







    }
}
