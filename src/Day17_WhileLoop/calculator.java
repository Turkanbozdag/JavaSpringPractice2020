package Day17_WhileLoop;

import java.util.Scanner;

/*write a program that can calculate the two numbers based on the user provided operators, the program will ask:
						1. enter first number
						2. enter the second number
						3. enter the math operators
								(assume that only the +, -, *, /, and % will be entered)						then the system will give the result based on the operator						at the end it will ask if the user want's to calculate another numbers, if user 						entered "NO" or "no", the program will stop execution, otherwise it repeats all the previous steps
								(you will need a lop that has true condition without the iterator)

 */
public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i=0;i>=12;){// islemi surekli yapsin diye ekledik
        System.out.println("Enter First number");
        int num1=input.nextInt();
        System.out.println("Enter second number");
        int num2=input.nextInt();
        System.out.println("Math operator:");
        //char operator=input.next().charAt(0);//+,-,*,/,%
        String operator=input.next();//+-*/%
        if (operator.equals("+")){
            System.out.println("Addition is:"+(num1+num2));

        }else if (operator.equals("-")){
            System.out.println("substraction is"+(num1-num2));
        }else if (operator.equals("*")){
            System.out.println("multiplication is:"+(num1*num2));

        }else if (operator.equals("/")){
            System.out.println("divisino is:"+(num1/num2));
        }else if (operator.equals("%")){
            System.out.println("remainder is:"+(num1%num2));
        }else{
            System.out.println("invalid operator");
        }
        System.out.println("do you want to continue");
        String answer=input.next();//yes or no diyeler icin
        if (answer.equalsIgnoreCase("no")) {// for icin ekledik

            break;
        }
        }




    }
}
