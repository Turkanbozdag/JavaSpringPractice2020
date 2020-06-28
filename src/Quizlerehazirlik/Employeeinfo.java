package Quizlerehazirlik;

public class Employeeinfo {
    private double salary;
    private long SSN;
    private int ID;
    private String Address;


    public static String companyName="Cyberetek";

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        salary=salary;
    }
    public long getSSN(){
        return SSN;

    }
    public void setSSN(long SSN){
        this.SSN=SSN;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address=Address;

    }


}
