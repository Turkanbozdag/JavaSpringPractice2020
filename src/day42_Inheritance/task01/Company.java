package day42_Inheritance.task01;
/*create a class called company:
					create 3 objects of employee and set thier info
					create an array of employees and store all those employee objects
					use regular for loop to print out each employee' name and employeeID
 */
public class Company {
    public static Employee employee1=new Employee();;
    public static Employee employee2=new Employee();;
    public static Employee employee3=new Employee();;

    static {

        employee1.setEmployeeInfo("turkan",30,'F',130000,3566,"developer");


        employee2.setEmployeeInfo("ali",30,'M',12000,3454,"tester");


        employee3.setEmployeeInfo("vildan",20,'F',1500000,4356,"Developer");
    }

    public static void main(String[] args) {
        Employee[]employees={employee1,employee2,employee3};
          for (int i=0; i<employees.length;i++){
              //System.out.println(employees[i]);
              System.out.println("");
          }

    }
}
