package Codiiiin;

public class classTaskReview {
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        //average:sum of all numbers/length
        int length=arr.length;
        int sum=0;
        for (int i=0;i<length;i++){
            int eachnum=arr[i];
            sum+=eachnum;
        }
        System.out.println(sum);
        System.out.println(sum/length);




    }
}
