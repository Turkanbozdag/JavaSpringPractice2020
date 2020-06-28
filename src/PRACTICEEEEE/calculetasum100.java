package PRACTICEEEEE;

public class calculetasum100 {

    public static void main(String[] args) {
        int sum1 = 0;
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum1 += i;

            } else {//odd number
                sum += i;
                System.out.print("evennumber" + sum);
                System.out.println("sum of all odd numbers:" + sum1);
            }
        }

    }
}
