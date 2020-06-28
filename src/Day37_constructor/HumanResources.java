package Day37_constructor;
/*    2. create a class called HumanResources

            declare 5 variables of Employee as static

            use static block to:

                        1. initialize those static variables

                        2. set all the info of the Employees
 */
public class HumanResources {

    static  employee employee1=new employee();
    static  employee employee2=new employee();
    static  employee employee3=new employee();
    static  employee employee4=new employee();
    static  employee employee5=new employee();

    public static void main(String[] args) {
        employee1.setInfo("zubeyde",1234,23456,"QA",12000,'F');
        employee2.setInfo("Kl",1223,556787,"SDET",100000,'M');
        employee3.setInfo("maria",3445,9774,"SDT",120000,'F');
        employee4.setInfo("Turkan",23454,876564,"SDET",140000,'F');
        employee5.setInfo("freg",546,859685,"QA",24,'M');
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);

    }
    static{//ister main icine ister ustune ister altina doesnt matterr
        employee1.setInfo("zubeyde",1234,23456,"QA",12000,'F');
        employee2.setInfo("Kl",1223,556787,"SDET",100000,'M');
        employee3.setInfo("maria",3445,9774,"SDT",120000,'F');
        employee4.setInfo("Turkan",23454,876564,"SDET",140000,'F');
        employee5.setInfo("freg",546,859685,"QA",24,'M');

    }







}
