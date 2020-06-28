package Practice1;

public class Student {
    String name;
    String nationality;
    int age;
    double gpa;
    char gender;
    boolean married;
    public void setStudentInfo(String name,String nationality,int age,double gpa,char gender,boolean married){
        this.name=name;
        this.nationality=name;
        this.age=age;
        this.gpa=gpa;
        this.gender=gender;
        this.married=married;
    }
    public String toString(){
        return "Name:"+name+", gender:"+gender+", nationality"+nationality+", age"+age+",married:"+married;
    }






}
