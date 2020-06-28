package Day37_constructor;
/*    1. Create a class called Employee

            instance variables:

                    name, id, ssn, jobTitle, salary, gender

            actions:

                    setEmployeeInfo(): can initialize all the instance variables

                    toString(): can return the info of the employee as string


creat a class
 */
public class employee {
    String name;
    long id;
    long ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setInfo(String name, long id, long ssn, String jobtitle, double salary, char gender) {//be sure iki tarfin inizilt oldugunun gormek icin this
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobtitle;
        this.salary = salary;
        this.gender = gender;

    }

   // public String toString() {//return


  //  }

}


