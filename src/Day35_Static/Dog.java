package Day35_Static;

public class Dog {
     static String breed;//basa static koydum burasi iki yerde ayni cikti verdi
     static boolean ispet=true;
    String age;

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.breed="Husky";
        dog1.ispet=true;

        Dog dog2=new Dog();
        dog2.breed="poddly";
        System.out.println(dog1.breed);//husky
        System.out.println(dog2.breed);//null

        System.out.println(dog1.ispet);



    }





}
