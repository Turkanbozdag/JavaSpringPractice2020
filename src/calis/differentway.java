package calis;

public class differentway {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5,9,3};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int each : arr) {
                if (each == arr[i]) {
                    count++;
                }
            }


            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
        int[]arr2={3,3,4,5,6,7,6,8,9,5,4,1,2};
    }

public static void uniqueElements(int[]a){

}

}