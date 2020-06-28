package PRACTICEEEEE;

public class Age {
    public static void main(String[] args) {
        int age=149;
        String ageGroup=" ";
        if (age<3 && age>0){
            ageGroup="baby";
        }else if (age>=3 && age<=5){
            ageGroup="todler";
        }else if (age>=6 && age<=9){
            ageGroup="kid";
        }else if (age>=10 && age<=12){
            ageGroup="pre-teen";
        }else if (age>=13 && age <=17){
            ageGroup="Teenager";
        }else if(age>=18 && age<=20){
            ageGroup="young Adult";
        }else if (age>=21 && age<=39){
            ageGroup="Adult";

        }else if (age>=40 && age <=49){
            ageGroup="Young Adult";

        }else if (age >=50 && age<=54) {

            ageGroup = "middle Aged Adult";
        }else if (age>=55 && age<=64){
            ageGroup="very young senior citizen";
        }else if (age>=65 && age<=74)
        {
            ageGroup="young senior citizen";
        }else if (age >=75 && age<=84){
            ageGroup="senior citizen";
        }else if (age>=85 && age<=150){
            ageGroup="old ";

        }else{
            ageGroup="invalid entry";
        }
        System.out.println(ageGroup);




    }
}
