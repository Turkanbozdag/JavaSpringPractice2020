package Practice1.task02;

public class Company {
    public static Employee employee1;
    public static Employee employee2;
    public static Employee employee3;

    static {
        employee1=new Employee();
        employee1.setEmployeeInfo("Azra",28,'F',1700000,34465,"DEVEloper");

        employee2=new Employee();
        employee2.setEmployeeInfo("Turkan",29,'F',130000,2435,"Developer");


        employee3=new Employee();
        employee3.setEmployeeInfo("Safar",23,'M',120000,56778,"BA");
    }

    public static void main(String[] args) {
        Employee[]employees={employee1,employee3,employee1};

        for (int i= 0;i<employees.length;i++){
            //System.out.println(employees[i]);
            System.out.println("name:"+employees[i].name+",ID:"+employees[i].employeeID);
        }



    }




}
