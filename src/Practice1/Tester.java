package Practice1;

public class Tester {
    String name;
    long employeeId;
    String jobTitle;
    double salary;

    public void setTesterInfo(String name, long employeeId, String jobTitle, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public String toString() {
        return "Name:" + name + ",JobTitle" + jobTitle + ", employeeID" + employeeId + ",salary" + salary;

    }

}
