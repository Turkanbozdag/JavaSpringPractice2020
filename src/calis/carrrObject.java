package calis;

import Day33_CustomClass.Car;

public class carrrObject {
    public static void main(String[] args) {
      Carr car1 = new Carr();//object of carr after new car class burasi objec kismi carr claa referens buradaki Carr
        car1.Brand="BMW";//burda brand degerini car1 ekledi tanimladi brand evi Carr aslinda
        car1.model="X5";
        car1.year=2020;
        car1.color="red";//assing ettik car1 hepsini
        System.out.println(car1.Brand);
        // Brand carr clasta tanimladigim seyi burada istim
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println("========================");


        Carr car2=new Carr();//2.object
         car2.Brand="toyota";
         car2.model="corolla";
         car2.year=2020;
         car2.color="white";
        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);







    }
}
