package Day38_Constructors;
/* Create class called SalaryCalculator
            instance variables:
                hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
            add a constructor can initialize those fields
            instance methods:
                salary(): returns the total salary as double
                salaryAftertax(): retuns the salary after tax as double
                stateTax(): retuns the total state tax as double
                federalTax(): retuns the total federal tax as double
                toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()

 */
public class salarycalculator {
double hourlyRate;
int weeklyhour;
double statetaxrate;
double federaltaxrate;
public salarycalculator(double hourlyRate,int weeklyhour,double statetaxrate,double federaltaxrate){
    this.hourlyRate=hourlyRate;
    this.weeklyhour=weeklyhour;
    this.statetaxrate=statetaxrate;
    this.federaltaxrate=federaltaxrate;
}

public  double salary(){//annual income
    //weekly*kac hafta is
    return hourlyRate*weeklyhour*48;
}
public double statetax(){//total tax paid to the state
    return salary()*statetaxrate;
}
public double federaltax(){//total tax paid to federal
    return salary()*federaltaxrate;
}
public double salaryAftertax(){//salary after tax
    return salary()-statetax()-federaltax();
}
public String toString(){
    return "hourly rate: $"+hourlyRate+"\nweekly hours:"+weeklyhour+"\ngross salary:$"+salary()+"\nstate tax: $"+statetax()+"\nfederal: $"+federaltax();
}



}
