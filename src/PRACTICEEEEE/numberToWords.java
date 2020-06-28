package PRACTICEEEEE;

import java.util.Scanner;

public class numberToWords {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter anumber between 0~9");
        int num=input.nextByte();
        String result="";

        switch (num){
            case 0:result="Zero";
            break;
            case 1:result="one";
            break;
            case 2:result="two";
            break;
            case 3:result="three";
            break;
            case 4:result="four";
            break;
            case 5:result="five";
            break;
            case 6:result="six";
            break;
            case 7:result=" seven";
            break;
            case 8:result="eight";
            break;
            case 9:result="nine";

            default:result="invalid";
        }
        System.out.println(result);
        String result2=(num==0)?"zero":(num==1)?"one":(num==2)?"two":(num==3)?"four":(num==4)?"five":(num==5)?"five":(num==6)?"six":(num==7)?"seven":(num==8)?"eight":(num==9)?"nine":"invalid";
        System.out.println(result2);

    }
}
