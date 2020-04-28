package day3;

public class salaryCalculate {
  /* rate = 55;
    stateTax = 0.04;
    federalTax =0.22;
    weeklyHours = 40;				then output will be:
    your salary is: 105600 USD
    your total tax is: 27456 USD
    your income after tax is: 78144 USD
    */
  public static void main(String[] args) {

// dataType variableName=data;
      double HourlyRate=55;
      double stateTaxRate=0.04;
      double federalTaxRate=0.22;
      byte weeklyHours=40;
      byte totalWeeks=52;
      // salary=hourlyRate*weeklyHours*52(week salary)
      double salary=HourlyRate*weeklyHours*52;//total salary before tax
      // stateTax=salary*stateRateTax
      double stateTax=salary*stateTaxRate;
      //federalTax=salary*federalTaxRate
      double federalTax=salary*federalTaxRate;
      //salary after tax=salary-stateTax-federalTax
      double salaryAfterTax=salary-federalTax-stateTax;


      }


      //salary=hourlyRate

    }

