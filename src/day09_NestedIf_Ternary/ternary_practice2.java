package day09_NestedIf_Ternary;

public class ternary_practice2 {
    public static void main(String[] args) {
    /*
    byte age=100;
        String agegroup="";
        if (age<3 && age>0){
            agegroup="Baby";
        }else if(age>=3 && age<=5){
            agegroup="Toddler";
        }else if(age>=6 && age<=9){
            agegroup="Kid";

        }else if (age>=10 && age<=12){
            agegroup="Pre-teen";
        }else if (age>=13 && age<=17){
            agegroup="teenager";
        }else if(age>=18 && age<=20){
            agegroup="Young Adult";
        }else if (age>=21 && age<=39){
            agegroup="Adult";
        }else if(age>=40 && age<=49) {
            agegroup = "Young Middle- Aged Adult";
        }else if (age>=50 && age<=54){
            agegroup="Middle Age Adult";
        }else if (age>=55 && age<=64){
            agegroup="very young senior citizin";
        }else if (age>=65 && age <=74){
            agegroup="Yong senior citizin";

        }else if (age>=75 && age<=84){
            agegroup="senior ctizin";

        }else if (age>=85 && age<=150){
            agegroup="old senior";
        }else {
            agegroup = "invalid entry";
        }

        System.out.println(agegroup);
*/
  /*  byte age=70;
    String agegroup="";
    String agegorup=(age<3 && age>0)?"baby":(age>=3 && age<=5)?"toddler":(age>=6 && age<=9)?"kid":(age>=10 && age<=12)?"Pre teen":(age>=13 && age<=17)?"teenegar":(age>=18 && age<=20)?"young adult"
:(age>=21 && age<=39)?"adult":(age>=40 && age<=49)?"young middle-age adult":(age>=50 && age<=54)?"middle age adult":(age>=65 && age<=74)?"young senior adult":(age>=74 && age<=84)?"senior citizin":(age>=85 && age<=150)?"old senior":"invalid"
*/









  int num1=300;
  int num2=200;
  int min=(num1<num2)?num1:num2;
        System.out.println(min);
        System.out.println("=========================");
        int hour=14;
        String result=(hour<12)?"good morning":(hour>12 && hour<18)?"Good afternoon":"good evening";
        System.out.println(result);

        System.out.println("========");
        int number=12000;
        boolean divisibleby3and5=(number%3==0 &&number%5==0)?true:false;
        System.out.println(divisibleby3and5);





    }
}
