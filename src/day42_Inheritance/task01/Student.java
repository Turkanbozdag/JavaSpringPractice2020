package day42_Inheritance.task01;
/*create a subclass of Person called Student
				attributes: name, age, gender, studentID, clazz
				methods: attendClass, code, setStudentInfo, toString

 */
public class Student extends  person {
    /*
    name(inherited)
    age(inherited)
    gender,(gender)
    studentide
    clazz
    setStudentInfo
    attendClass
    code toString
     */
public long studentId;
public String clazz;
public static  String schoolName="Cybertek ";
public void setStudentInfo(String name,int age,char gender,long studentId,String clazz){
    setPersonInfo(name,age,gender);
    this.studentId=studentId;
    this.clazz=clazz;
}
public void attendClass(){
    System.out.println(name+"is attending"+clazz);
}
public void code(){
    System.out.println(name+"is coding");
}
public String toString(){
    return "name: "+name+", Id:"+studentId+", age:"+age+", gender:"+gender+", class: "+clazz+", school:"+schoolName;
}
}
