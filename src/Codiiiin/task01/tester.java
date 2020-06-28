package Codiiiin.task01;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

public class tester extends Employee {
    /*name(inherited)
    salary(inherited)
    id(inherited)
    jobtitle(inherited)
    gender(inherited)
    reporting()
    testing()

     */
public  tester(String name,double salary, int id,String jobTitle,char gender){
    this.name=name;
    this.salary=salary;
    this.id=id;
    this.jobTitle=jobTitle;
    this.gender=gender;
}

    public void reporting(){
        System.out.println(name+" is reporting bug");
    }
    public void testing(){
        System.out.println(name+"is testing");
    }




}
