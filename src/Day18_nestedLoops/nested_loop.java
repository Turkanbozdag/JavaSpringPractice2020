package Day18_nestedLoops;

public class nested_loop {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++) {//5 times print
            System.out.println("Hello");
        }
        for (int i=1;i<=5;i++){
            System.out.println("hello");
        }
        System.out.println();
        System.out.println("===========================");

        for (int i=0; i<=7;i++) {//outter loop repeating the inner loop over and over again


            int a = 1;
            while (a <= 100) {
                System.out.println("* ");//ust kismi
                a++;
            }
            System.out.println();
            System.out.println("hello");
        }




    }
}
