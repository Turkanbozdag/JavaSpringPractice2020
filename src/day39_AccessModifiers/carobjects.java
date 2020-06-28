package day39_AccessModifiers;
/*create a class called Car:

                instance variable:

                        brand, model, year, price

                add a constructor that can initialize brand of car

                add a constructor that can initialize brand and model of the car

                                (apply constructor call to initalize the brand)

                add a constructor that can initialize the brand, model, year of the car

                                (apply constructor call to initialize brand, model)

                add a constructor that can initialize brand, model, year and price of the car

                                (apply constructor call to initialize brand, model, year)

                add toString method



 */
public class carobjects {
    public static void main(String[] args) {
        //new constructor
       Car car1= new Car("toyota");
        System.out.println(car1);
        Car car2=new Car("BMW","X6");
        System.out.println(car2);

        Car car3=new Car("lexus","RX",2020);
        System.out.println(car3);
        Car car4=new Car("Tesla","model 3",2020,400000);
        System.out.println(car4);
    }

}
