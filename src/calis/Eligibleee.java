package calis;

public class Eligibleee {
    public static void main(String[] args) {
        int age =18;
        boolean citizen=true;
        boolean likeDonald=true;

        boolean eligible=age>=18 && citizen==true;
        if (eligible==true){
            System.out.println("you are eligible to vote");
        }
        if( eligible!=true){
            System.out.println("you are not eligible to vote");
        }

        int number=-12;
        if(number %2==0){
            System.out.println(number+"is even");

        }
        if (number % 2!=0){
            System.out.println(number+"odd");
        }




    }
}
