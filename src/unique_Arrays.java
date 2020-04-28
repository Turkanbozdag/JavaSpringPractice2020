public class unique_Arrays {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 4, 1, 5,6,9, 5};

        //arr[0]===>1
        for (int each2 : arr) {
            int count = 0;
            for (int each : arr) {
                if (each == each2) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(each2);
            }

        }
    }
}