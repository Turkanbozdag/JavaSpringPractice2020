package office04_15;

public class SingleArray {
    public static void main(String[] args) {

    int a=100;
    int[]arr={100,200,300};

        System.out.println(arr[1]);

        for (int i=0;i<3;i++){
            int num=arr[i];
            System.out.println(num);
        }
        System.out.println("========");
        int j=0;
        while(j<3){
            int num=arr[j];
            j++;

            System.out.println(num);
        }




    }
}
