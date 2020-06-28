package Codiiiin.nighttask;

import java.util.Scanner;

public class monthsArray {
    public static void main(String[] args) {
        String[]months={"jan","feb","mar","Ap","may","jun","jul","agu","sep","oct","nov","dec"};
        /*
        String[]months2=new String[12];
        months2[0]="jan";
        */
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num=input.nextInt();
        String arr1=months[6];
        System.out.println("Happy birthday Abdulllah Anasinin cucugu");
        String result=months[num-1];
       // if (num==1){
          //result = months[num-1];
        System.out.println(result);
        }





    }

