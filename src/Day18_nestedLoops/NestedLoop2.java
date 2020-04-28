package Day18_nestedLoops;

public class NestedLoop2 {
    public static void main(String[] args) {
        /*
         **
         * *
         *
         *
         * * * * *




         */
        for (int j = 9; j >= 0; j++) {//ucgenin// ust kismi

            for (int i = 1; i <= j; i++) {
                System.out.println("* ");
            }
            System.out.println();
        }
        System.out.println("==========");
        for (char z = 'a'; z <= 'e'; z++) {//vertikalli z yapiyp
            for (char ch = 'a'; ch <= 'e'; ch++) {
                System.out.println(ch + " ");
            }
            System.out.println();
            System.out.println("Hello");


        }
    }

}