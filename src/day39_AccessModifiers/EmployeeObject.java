package day39_AccessModifiers;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee("rustem");
        System.out.println(employee1);
        Employee employee2=new Employee("john","mechanic");
        System.out.println(employee2);

        Employee employee3=new Employee("saban","SDET",123);
        System.out.println(employee3);

        Employee employee4=new Employee("ozgur","SDET",456,120000);
        System.out.println(employee4);

        Employee employee5=new Employee("osman","SDET",789,120005,'M');
        System.out.println(employee5);




    }








}
