package Codiiiin;

public class Tester {
    String name;
    String jobTitle;
    double salary;
    long employeeId;
    public void setInfo(String name,String jobTitle,double salary,long employeedId){
        this.name=name;//
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.employeeId=employeedId;

    }
    public String toString(){
        return " name: "+name+", jobTitle: "+jobTitle+", salary:$"+salary+", ID:"+employeeId;
    }
    public void smokeTesting(){
        int name=100;
        System.out.println(this.name+" is doing smoke testing");
    }
    public void creatingTicket(){
        System.out.println(this.name+" is creating ticket on jira");
    }

}
