package day07_Ifstatements;

public class Vote {
    public static void main(String[] args) {
        int age=18;
        boolean citizen=true;
        boolean likeDonald=true;
        boolean eligible=age==18 && citizen ==true;
        if (eligible){
            System.out.println("you are eligible to vote");
        }
        if (!eligible){//eligible==false ikiside olur
            System.out.println(" you ca not vote");
        }
















    }


















}
