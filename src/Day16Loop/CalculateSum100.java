package Day16Loop;
/*
write  aprogram can calculate sum of all the even num between 1~100



 */
public class CalculateSum100 {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        for (int i=0;i<=100;i++){
            if (i %2==0){
                sum1 +=i;

            }else{
                sum2+=i;
            }
        }
        System.out.println("sum of all even numbers:"+sum1);
        System.out.println("sum of all odd numbers:"+sum2);










    }
}
