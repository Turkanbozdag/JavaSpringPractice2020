package Day37_constructor;

public class carobject {
    public static void main(String[] args) {
        Car  car1=new Car("toyota","carolla",2020,32000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1);

        Car car2=new Car("mercedes","c300",2018,45000);
        System.out.println(car2);






    }
}
