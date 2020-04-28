package Day17_WhileLoop;

import java.util.Scanner;

/*up tasks:
	1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement	2. write a program that can ask the user "enter a number" five times and return the minimum number


 */
public class max_min {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int Maxnumber=-9899999;//min number  apposite bunun tersini uygula
        //first user entered variable will be inittalized to max number
        //maxnumber=0;
        for(int i=1;i<=10;i++) {// i:1,2,3,5

            System.out.println("enter a number");
            int num = input.nextInt();//0,1,2,3,4//burasi 5 kez number gir komutu yer
            if (num > Maxnumber) {//burasi dogru ise alltaki satir calisacak//to comper each user inputs,and assingn the maximum nuber to maxnumber
                Maxnumber = num;
            }

        }
        System.out.println(Maxnumber);





    }
}
