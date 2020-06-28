package officeHours._04_29_2020.office04_15;

public class ForEachLoop {
    public static void main(String[] args) {
        //for each loop
        int[] arr = {1, 2, 3, 4, 5, 6,};
        for (int each : arr) {
            if (each == 3) {
             break;   //continue;
            }
            System.out.println(each);

        }


    }

}