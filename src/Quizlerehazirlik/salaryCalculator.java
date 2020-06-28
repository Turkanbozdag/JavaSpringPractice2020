package Quizlerehazirlik;

public class salaryCalculator {
    double hourlyRate;
    int weeklyHour;
    double stateTaxRate;
    double federaltaxRate;


    public salaryCalculator(double hourlyRate){
        this.hourlyRate=hourlyRate;
        this.weeklyHour=weeklyHour;
        this.stateTaxRate=stateTaxRate;
        this.federaltaxRate=federaltaxRate;
    }
    public double salary(){//annual income
        return hourlyRate*weeklyHour*48;
    }
        public double stateTax(){//total tax
        return salary()*stateTaxRate;
        }
        public double federaltax(){//total tax paid to the federal
        return salary()*federaltaxRate;
        }
        public double salaryAfterTax(){
        return salary()-stateTax()-federaltax();
        }
        public String toString(){
        return "hourly rate: $"+hourlyRate+"\n weeklyhours: "+weeklyHour+"\n gross salary: "+salary()+"\n statetax: $"+stateTax()+"federalTaxRate:"+federaltaxRate;

        }


}
