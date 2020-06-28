package officeHoursMay13;

public class Constructor {
    public Constructor(){
        System.out.println("default constructor");
    }




    public static void main(String[] args) {
        Constructor obj = new Constructor();
        System.out.println("+++++++++++++++++++++++++");
        Employee employee1=new Employee("hello",123,12000);
        System.out.println(employee1.name);
        System.out.println(employee1.id);
        System.out.println(employee1.salary);
        Employee employee2=new Employee("reem",345,110000);
    }
}
class Employee{
    String name;
    long id;
    double salary;
    public Employee(String name,long id,double slary){
        this.name=name;
        this.id=id;


    }
    public String toString(){
        return"name"+name+", id:"+id+",salary:"+salary;
    }
}