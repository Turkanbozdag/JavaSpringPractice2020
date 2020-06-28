package Day41_inheritance;

import Day41_inheritance.task01.employee;

public class Tester extends employee {



    public Tester(String name,double salary,int id,String jotitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.jobtitle=jobtitle;
        this.gender=gender;

    }
    public void reporting(){

        System.out.println(name+"is reporting");

    }
    public void testing(){
        System.out.println(name+"is testing");
    }




}
