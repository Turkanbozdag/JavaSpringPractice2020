package Practice_05_06_2020;

public class Tester {
    String name;
    String jobTitle;
    double salary;
    long emloyeeId;

    public void setInfo(String name,String jobTitle, double salary,long emloyeeId){
                    this.name=name;//user given argument name is assigned to instance variable name
                    this.jobTitle=jobTitle;
                    this.salary=salary;
                    this.emloyeeId=emloyeeId;



    }
    public String toString(){
        return "Name:"+name+", job title: "+jobTitle+", salary:$ "+salary+", Id:"+emloyeeId;
    }
    public void smokeTesting(){

        System.out.println(this.name+" is doing smke test");
    }
    public void creatingTicket(){
        System.out.println(this.name+"is creatin tester");
    }

}
