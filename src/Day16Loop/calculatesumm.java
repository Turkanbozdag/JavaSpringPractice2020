package Day16Loop;

import java.util.Scanner;

public class calculatesumm {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("eneter a num");
        int num=input.nextInt();
        int sum=0;
         for (int i=1; i<=num;i++){
             sum+=i;
         }
        System.out.println(sum);




    }
}
