package day09_NestedIf_Ternary;

public class Ternary2 {

    public static void main(String[] args) {
        String result="";
        if (9>10) {
            result = "9is greatr";
        }else{
                result="10 is greate";
            }
        System.out.println("=============");

        String result2=(9>10)? "9 is greater":"10 is greater";


        System.out.println(result);
        System.out.println(result2);


        System.out.println("=========");
        int age=20;
        boolean eligibility;
        if (age>=21){
            eligibility=true;
        }else{
            eligibility=false;
        }
        //boolean eligibility =(age>=21)?"true":"false";

        System.out.println("==================");
int ageofperson=20;
String eligibletovote="";
if (ageofperson>=18){
    eligibletovote="yes";
}else{
    eligibletovote="no";
}

String eligibletovote2=(ageofperson>=18)?"yes":"no";

        System.out.println(eligibletovote);
        System.out.println(eligibletovote2);
    }
}
