package officeHours.officeHoursmarch25;

public class nestedif_practice2 {

    public static void main(String[] args) {
        /* for the loan:
        if has a job that pay>50000$==>might be eligible
        if he/she has good credit
        if job history is more than or equal to 2==>then eligible
         */
        int salary=45000;
        short creditscore=750;
        byte jobhistory=1;

        if(salary>50000){

        }if (creditscore>650){
            //eligible for loan
        }else {//not eligible
            System.out.println("you do not have good credit score");
        }
        if (jobhistory>=2){
            System.out.println("you are qualified");
        }else {//not eligible due to job history
            System.out.println("you do not have enough jo history");


       // } else {
            System.out.println("you have job that pay 50000");
        }





    }

}

