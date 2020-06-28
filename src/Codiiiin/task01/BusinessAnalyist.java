package Codiiiin.task01;

public class BusinessAnalyist extends Employee {
    /*
    salary
    name
    id
    jobtitle
    gender
    writing()
    gathering()
    toString()
     */

    public  BusinessAnalyist(String name,double salary,long id,String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobTitle="Business Analist";
        this.gender=gender;
    }

    public void writingReq(){
        System.out.println(name+" is writing requrements");
    }
    public void gathering(){
        System.out.println(name+" is gathering requirements");
    }

}
