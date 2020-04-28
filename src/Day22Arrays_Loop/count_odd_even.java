package Day22Arrays_Loop;
/*write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
 */
public class count_odd_even {
    public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6,7,8,9,10};

    int countoddnumber=0;
    int countevennumber=0;

    for (int each:arr){
        /*
        if (each%2!=0){
            countoddnumber++;
        }else{
            countevennumber++;
        }

         */
    }

        System.out.println("even numer:"+countevennumber);
        System.out.println("odd number is:"+countoddnumber);

    }
}
