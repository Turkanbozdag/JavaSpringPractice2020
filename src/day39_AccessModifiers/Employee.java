package day39_AccessModifiers;
/*create a class called Employee:

                instance variables:

                        name, jobTitle, ID, salary

                add a constructor that can initialize name of employee

                add a constructor that can initialize name, jobTitle of the employee

                            (apply constructor call to initialize the name)

                add a constructor that can initialize name, jobTitle, ID of the employee

                            (apply constructor call to initialize the name and jobTitle)

                add a constructor that can initialize name, jobTitle, ID, salary of employee

                            (apply constructor call to initialize the name, jobTitle, ID)

                add toString method

 */
public class Employee {
    String name;
    String jobtitle;
    long id;
    char gender;
    double salary;
    static String companyName="BOA";

    public Employee(String name){
        this.name=name;
    }
    public Employee(String name,String jobtitle){
        this(name);//this.name=name;
        this.jobtitle=jobtitle;
    }
    public Employee(String name,String jobtitle,long id){
        this(name, jobtitle);
       // this.name=name;
        //this.jobtitle=jobtitle;
        this.id=id;
    }
    public Employee(String name,String jobtitle,long id,double salary){
        this(name,jobtitle,id);//this.name=name;&this.jobtitle=jobtitle;& this.id=id;
        this.salary=salary;
    }
    public Employee(String name,String jobtitle,long id,double salary,char gender){
        this(name,jobtitle,id,salary);
        this.salary=salary;
    }

    public String toString(){
        return"name:"+name+"id"+id+"jobtitle:"+jobtitle+"salary"+salary+" gender:"+gender;
    }


}
