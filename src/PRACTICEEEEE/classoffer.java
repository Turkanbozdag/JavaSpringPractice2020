package PRACTICEEEEE;

public class classoffer {
    String location;
    String company;
    double salary;
    boolean isfulltime;
    public void setInfo(String location,String company,double salary,boolean isfulltime){
        this.location=location;
        this.company=company;
        this.salary=salary;
        this.isfulltime=isfulltime;
    }

    public String toString(){
        return "location:"+location+" company:"+company+" salary: "+salary+" isfulltime: "+isfulltime;
    }




}
