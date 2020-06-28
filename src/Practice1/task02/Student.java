package Practice1.task02;
/*
create a class called studet atributes:name
age
gender
studentId,clazz
 */


public class Student extends Person {
public long studentId;
public String clazz;
public static String schoolName="cybertek";//java reverse class ondan clazz aldik:)

public void setStudentInfo(String name,int age,char gender,long studentId,String clazz){
    setPersonInfo(name,age,gender);
    this.studentId=studentId;
    this.clazz=clazz;
   // public static String schoolName="Cybertek";

}




    public void attendClass(){
        System.out.println(name+"is attending "+clazz);
    }
    public void code(){
        System.out.println(name+" is coding");
    }
    public String toString(){
    return "name :"+name+"Id:"+studentId+", age:"+age+"gender:"+gender+", class:"
            +clazz+" school:"+schoolName;
    }







}
