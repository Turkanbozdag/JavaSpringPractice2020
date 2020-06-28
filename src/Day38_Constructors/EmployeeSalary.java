package Day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {
        salarycalculator Vildan=new salarycalculator(60,40,8.25/100,0.2);
        System.out.println(Vildan.salary());
        System.out.println(Vildan);
        salarycalculator mesut=new salarycalculator(70,40,8.25/100,0.25);
        System.out.println(mesut);






    }
}
