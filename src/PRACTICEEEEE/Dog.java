package PRACTICEEEEE;

public class Dog {
    String breed;
    static boolean ispet;

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.breed="Husky";
        dog1.ispet=true;

        Dog dog2=new Dog();
        dog2.breed="poddle";

        System.out.println(dog1.breed);
        System.out.println(dog2.breed);


        System.out.println(dog1.ispet);
        System.out.println(dog2.ispet);




    }
}
