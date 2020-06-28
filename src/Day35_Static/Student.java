package Day35_Static;

public class Student {
    /*
    create a custom class called student
    Atribute:
     */
    String name;
    int id;
    double gpa;
     static String school="Cybertek";
     //public static void setInfo(String name,int id,double gpa){//if we are using any insatance the method should not be static
    public void setInfo(String name,int id, double gpa){
         this.name=name;
     }
     public static void printSchoolName(){
         System.out.println("school name is "+school);
     }
     public String toString(){
        return "Name:"+name+", School Name "+school;
     }




}
