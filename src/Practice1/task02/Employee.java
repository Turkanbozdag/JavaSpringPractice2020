package Practice1.task02;

public class Employee extends Person {
    /*name
    age
    gender
    salary
    employeeID
    jobTitle

    setPersonInfo
     */
public double salary;
public long employeeID;
public String jobTitle;

public void setEmployeeInfo(String name,int age,char gender,double salary,long employeeID,String jobTitle){
    setPersonInfo(name,age,gender);
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.employeeID=employeeID;
    this.jobTitle=jobTitle;
    this.salary=salary;
}
public void work(){
    System.out.println(name+"is working");
}
public String toString(){
    return "name:"+name+", jobtitle:"+jobTitle+", ID"+employeeID+"Salary"+salary+" ,age"+age+", gender:"+gender;
}

}
