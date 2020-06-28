package Practice1;

public class humanresources {
    static employee employee1=new employee();
    static employee employee2=new employee();
    static employee employee3=new employee();
    static employee employee4=new employee();
    static employee employee5=new employee();

    public static void main(String[] args) {
        employee1.setInfo("zuleyha",123,9876,10000,'F');
        employee2.setInfo("vildannn",124,150,150000,'F');
        employee3.setInfo("azra",13245,8765,200000,'F');

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
    static {
        employee1.setInfo("zuleyha",123,9876,10000,'F');
        employee2.setInfo("vildannn",124,150,150000,'F');
        employee3.setInfo("azra",13245,8765,200000,'F');
    }


}
