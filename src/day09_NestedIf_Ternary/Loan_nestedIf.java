package day09_NestedIf_Ternary;

public class Loan_nestedIf {
    public static void main(String[] args) {
        double salary=120000;
        byte workhistory=3;
        if (salary>=30000) {//might be qualified
            if (workhistory>=2){
                System.out.println("you are qualifiy");
            }else {
                System.out.println("you must have been on job at least 2 years");
            }

        }else {
            System.out.println("you must earn at least $30000");

        }






    }

}
