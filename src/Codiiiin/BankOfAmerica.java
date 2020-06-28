package Codiiiin;

import Day40_Encapsulation.EmployeeInfo;

public class BankOfAmerica {
    public static void main(String[] args) {
        EmployeeInfo Abdullah=new EmployeeInfo();
        Abdullah.setAddress("florida");
        Abdullah.setSalary(1500000);

        System.out.println(Abdullah.getAddress());
        System.out.println(Abdullah.getCompanyname());
        System.out.println(Abdullah.getSalary());




    }




}
