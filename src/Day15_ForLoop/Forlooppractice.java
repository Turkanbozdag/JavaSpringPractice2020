package Day15_ForLoop;

public class Forlooppractice {
    public static void main(String[] args) {
        /*
    odd number    i want ta print between 1~100 in a single line sperated by a space
         */
String resultodd="";
    for (int number=1;number<=100;number+=2){
       // System.out.println(number+" ");//+" yanyana yazdik sayilari bunlarla

  //resultodd +=number+"";
        resultodd=resultodd+number+" ";

    }

    /*
    even number between 1~100
    2 4 6 8 10...

     */
        String resulteven="";
        for (int number=0; number<=100; number +=2) {
            resulteven += number + " ";
        }
        System.out.println(resultodd);
            System.out.println(resulteven);




    }
}
