package calis;

public class Array_Size {
    public static void main(String[] args) {
        int[]arr1={1,2,3};//0~2
       // System.out.println(arr1[100]);//arrays size is fixed
        int[]nums=new int[2];
        System.out.println(nums);
        nums[0]=10;
        nums[1]=20;
        //nums[2]=30;array's size is fixed
            nums=new int[3];//reset,{0,0,0}

        System.out.println(nums[0]);
        System.out.println(nums[1]);











    }
}
