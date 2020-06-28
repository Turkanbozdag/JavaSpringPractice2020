package Practice1;

public class Developer {
    String name;
    String jobTitle;
    double salary;
    long employeeId;


    public void setInfo(String name,String jobTitle,double salary,long employeeId){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
        this.employeeId=employeeId;
    }
        public String toString(){
        return "Name:"+name+", jobtitle: "+jobTitle+", salary:$"+salary+", ID:"+employeeId;
        }
        public void coding(){
            System.out.println(name+"is coding");
        }
        public void fixingBug(){
            System.out.println(name+" is created");
        }







}
