package officeHours.Practice_04_22;

public class void_Method {

    public static void main(String[] args) {
        print();

        System.out.println("====================");
        boolean Uscitizen = true;
        int age = 21;
        vote(1, true);
        vote(35,false);

    }

    private static void vote(int age, boolean Uscitizen) {
        boolean eligibleTovote = age >= 18 && Uscitizen == true;
        if (eligibleTovote) {
            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligiblle to vote yet");
        }
    }


    public static void print() {

    }

    public static void Vote(int age, boolean Uscitizen) {



   /* public static void print(){
        System.out.println("hello batch18");
        System.out.println("hello batch18");
        System.out.println("hello batch18");
        System.out.println("hello batch18");
        System.out.println("hello batch18");
    }*/

    }
}