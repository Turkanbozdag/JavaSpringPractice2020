package PRACTICEEEEE;

public class employeesalary {
    public static void main(String[] args) {
        salarycalculate turkan=new salarycalculate(55,40,8.24/100,0.2);
        System.out.println(turkan.salary());
        System.out.println(turkan);

        salarycalculate  aysee=new salarycalculate(60,40,8.75/100,0.26);

        System.out.println(aysee.salaryAftertax());
    }
}
