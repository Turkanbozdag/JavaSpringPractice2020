package Codiiiin.nighttask;

public class MaxMin {
    public static void main(String[] args) {
        int[]arr={1,2,3,0,4,5,6,97,8};
        int lastindex=arr.length-1;
        int max=arr[0];
        int min=arr[0];
        //System.out.println(lastindex);
        for (int i=0;i<=lastindex;i++){
            if (arr[i]>=max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(min);
        System.out.println(max);






    }








}
