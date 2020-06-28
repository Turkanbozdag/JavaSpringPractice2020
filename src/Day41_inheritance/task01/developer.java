package Day41_inheritance.task01;

import Day41_inheritance.task01.employee;

public class developer extends employee {

    public developer(double salary,String name,long id,String jobtitle,char gender){

        this.gender=gender;
        this.jobtitle=jobtitle;
        this.id=id;
        this.name=name;
        this.salary=salary;


    }
    public void fixingBug(){
        System.out.println(name+"is fixing the bug");
    }

public void coding(){
    System.out.println(name+"is coding");
}


}
