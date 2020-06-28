package Resources;
import  day39_AccessModifiers.personalInfo;

public class CheckInfo {
    public static void main(String[] args) {
        System.out.println(personalInfo.name);
        System.out.println(personalInfo.gender);


       // System.out.println(personalInfo.grade);
       // System.out.println(personalInfo.age);
       // System.out.println(personalInfo.SSN);
       // System.out.println(personalInfo.ID);

        personalInfo obj=new personalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);
        //System.out.println(obj.grade);
        //System.out.println(obj.age);

        //System.out.println(obj.SSN);
        //System.out.println(obj.ID);

    }
}
