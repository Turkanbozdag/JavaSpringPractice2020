package Codiiiin.task01;

public class developer extends Employee {
 /*
 salary
 name
 id
 jobtitle
 gender
  fixingBug
  coding
  */
 public developer(double salary,String name, long id,String jobTitle,char gender){
     this.gender=gender;
     this.jobTitle=jobTitle;
     this.id=id;
     this.name=name;
     this.salary=salary;
 }
public void fixingBug(){
    System.out.println(name+"is fixing the bug");
}
public void coding(){
    System.out.println(name+" is coding");
}




}
