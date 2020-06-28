package day42_Inheritance.task01;
/*
		create a sub class of person called Employee
				attributes: name, age, gender, Salary, employeeID, jobTitle
				methods: work, setEmployeeInfo, toString
 */
public class Employee extends person {
/*
name(inherited)
age(inherited)
gender(inherited)
salary
employeeID
jobTitle
toString(
 */
public double salary;
public long employeeId;
public String jobtitle;

public void setEmployeeInfo(String nam,int age,char gender,double salary,long employeeID,String jobtitle ){

    //setPersonInfo(name,age,gender);kolay olsun diye buda olur
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.employeeId=employeeID;
    this.jobtitle=jobtitle;
    this.salary=salary;
}
public void work(){
    System.out.println(name+"is working");
}
public String toString(){
    return "name:"+name+", jobtitle:"+jobtitle+",id"+employeeId+", salary:"+salary;
}

}
