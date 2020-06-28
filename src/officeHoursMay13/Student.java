package officeHoursMay13;

public class Student {

    String name;
    long id;
    static String schoolname="cybertek";
    public String toString(){
        return "name:"+name+", id:"+id+",School name:"+schoolname;
    }
    public void printSchoolNAme(){
        System.out.println(schoolname+"school");
    }
}
class studentobjects{
    public static void main(String[] args) {
        Student student1= new Student();
        student1.name="madina";
        student1.id=123;

        Student student2=new Student();
        student2.name="emrah";
        student1.id=456;
        student1.schoolname="Harvard";
        student2.name="namik kemal";


        System.out.println(student1);
        System.out.println(student2);
    }
}
