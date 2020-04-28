package day07_Ifstatements;
/*1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triangle is valid or not.	2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)	3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)	4. write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal) 	5. write a java program that can identify if a person is eligible to vote for Donald Trump


 */

public class maxNumber {
    public static void main(String[] args) {
        double a=100;
        double b=200;
        double c=300;
        boolean agreater=a>b && a>c;//if a is greater than both b and c,the a max num
        boolean bgreater=b>a && b>c;// if b is greater than both a and c,then bmax
       // boolean bgreater2=b>a|| b>c;
        boolean cgreater=c>a&&c>b;// if c is bigger than both c is max
        if(agreater) {
            System.out.println(a + "is greater");
        }
            if (bgreater) {
                System.out.println(b + " is greater");
            }
                if (cgreater) {
                    System.out.println(c + "is greater");
                }











            }
        }