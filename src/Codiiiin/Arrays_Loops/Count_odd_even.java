package Codiiiin.Arrays_Loops;

public class Count_odd_even {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};

        int countOddnumbers=0;
        int countEvennumber=0;

        for (int each:arr){
            if (each % 2==0){
                countEvennumber++;
                continue;
            }
                countOddnumbers++;

        }
        System.out.println("even numbers: "+countEvennumber);
        System.out.println("odd number: "+countOddnumbers);


    }





}
