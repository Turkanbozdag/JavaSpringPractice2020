package Quizlerehazirlik;

public class dog {
   String breed;
    String age;
    static boolean ispet;

    public static void main(String[] args) {
        dog dog1=new dog();
        dog1.breed="Husky";
        dog1.ispet=true;

        dog dog2=new dog();
        dog2.breed="poddle";


        System.out.println(dog1.breed);
        System.out.println(dog2.breed);

        System.out.println(dog1.ispet);
        System.out.println(dog2.ispet);




    }



}
