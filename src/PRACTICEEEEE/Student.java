package PRACTICEEEEE;

public class Student {
    String name;
    int id;
    double gpa;
    static String school="cybertek";
    public  void setInfo(String name,int id,double gpa){//if we are using any instance ,the method should not be static
        this.name=name;
        this.id=id;
        this.gpa=gpa;
    }
    public static void printschoolname(){
        System.out.println("school name is:"+school);
    }
    public String toString(){
        return "name:"+name+", school name:"+school;
    }
}
