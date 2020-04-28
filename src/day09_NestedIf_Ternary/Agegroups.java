package day09_NestedIf_Ternary;
/*

      Adult (21 - 39),
  age groups are:
        baby (< 3 year)
        Toddler (3 - 5),
        Kid (6 - 9),
        Pre-Teen (10 - 12),
        Teenager (13 - 17),
        Young Adult (18 - 20),
        Young Middle-Aged Adult (40 - 49),
        Middle-Aged Adult (50 - 54),
        Very Young Senior Citizen (55 - 64),
        Young Senior Citizen (65 - 74),
        Senior Citizen (75 - 84),
        Old Senior Citizen (85+)









 */





public class Agegroups {





    public static void main(String[] args) {
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
      //  boolean eligibleTobuy= agegroup=="adult"|| agegroup=="young middle-aged adult"||
        //        agegroup==middle-aged adult";








    }
}
