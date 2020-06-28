package Day40_Encapsulation;

public class bankofamerica {
    public static void main(String[] args) {
        EmployeeInfo Abdul=new EmployeeInfo();
        Abdul.setAddress("virginia");
        Abdul.setSalary(120000.50);

        System.out.println(Abdul.getAddress());
        System.out.println(Abdul.companyname);
        System.out.println(Abdul.getSalary());


    }




}
