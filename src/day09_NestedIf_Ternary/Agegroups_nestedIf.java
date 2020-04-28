package day09_NestedIf_Ternary;

public class Agegroups_nestedIf {
    public static void main(String[] args) {
        /*
        age groups are:
        teenager(<20)
        adult(>=21 && <55)
        senior(>55)
        age cannot be negative or greater than150

         */

       /* byte age=18;
        String person="";
        if (age>=0 && age<=150);
        if (age<=20){
            person="teenager";
        }else if(age>=20 && age<=55){
            person="adult";
        }else if (age>55){
            person="senior";
        }else{
            person="not eligible";
        }
        System.out.println(person);
    */
       int age=27;
       String agegroup="";
       if (age<150 && age>0){
           if (age<21) {
               agegroup = "teenager";
           } else if (age<55) {// age is already greater or equal to 21
               agegroup = "adult";
           }else {
               agegroup = "senior";
           }
       }else{
           agegroup="invalid entry";
       }

        System.out.println("=====================");
            int age2=45;
            String agegroup2="";
            if (age2<150 && age2>0){
                agegroup=(age2<21)?"teenager":(age2<55)?"Adults":"senior";
                System.out.println(agegroup2);// adult
                System.out.println(agegroup2);
            }










    }
}
