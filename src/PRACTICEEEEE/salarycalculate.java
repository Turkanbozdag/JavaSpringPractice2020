package PRACTICEEEEE;

public class salarycalculate {

double hourlyrate;
int weeklyhour;
double statetaxrate;
double federaltaxrate;
public salarycalculate(double hourlyrate,int weeklyhour,double statetaxrate,double federaltaxrate){
    this.hourlyrate=hourlyrate;
    this.weeklyhour=weeklyhour;
    this.statetaxrate=statetaxrate;
    this.federaltaxrate=federaltaxrate;

}
public double salary(){
    return hourlyrate*weeklyhour;
}
public double statetax(){
    return salary()*statetaxrate;
}
public double federaltax(){
    return salary()*federaltaxrate;
}
public double salaryAftertax(){
    return salary()-statetax()-federaltax();
}
public double salaryaftertax(){
    return salary()-(statetax()+federaltax());
}
public String toString(){
    return "hourly rate: $"+hourlyrate+"\nweekly hours:"+weeklyhour+"\ngross salary: $"+salary()+"\nstate tax: $"+statetax()+
            "\nfederal tax: $"+federaltax()+"net salary: $"+salaryAftertax();
}







}
