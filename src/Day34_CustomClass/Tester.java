package Day34_CustomClass;

public class Tester {
    String name;
    long employeeID;
    String JobTitle;
    double salary;
    public void setTesterInfo(String name,long employeeID,String jobTitle,double salary){
        this.name=name;
        this.employeeID=employeeID;
        this.JobTitle=jobTitle;
    }
    public String toString(){
        return  "name: "+name+", job Title:"+JobTitle+",emploee id:"+employeeID+", salary: "+salary;
    }
}