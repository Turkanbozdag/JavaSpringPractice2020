package Day12;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);//13+enter tutuyo


        System.out.println("enter your name");
        int num=input.nextInt();//13 tutuyoenter+enter+enter+"muhtar"
        System.out.println(num);

        input.nextLine();//used for taking out the enter
        System.out.println("enter your name");
        String name =input.nextLine();//burasi entere tutuyo simdi yukari scannerda enter atandi

        System.out.println(name);









    }

}
