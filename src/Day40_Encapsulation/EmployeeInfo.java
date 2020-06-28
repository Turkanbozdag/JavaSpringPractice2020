package Day40_Encapsulation;

public class EmployeeInfo {
    private double salary;
    private long SSN;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSSN() {
        return SSN;
    }

    public void setSSN(long SSN) {
        this.SSN = SSN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static String getCompanyname() {
        return companyname;
    }

    public static void setCompanyname(String companyname) {
        EmployeeInfo.companyname = companyname;
    }

    private  int ID;
    private  String address;

   public static String companyname="Cybertek";
}
