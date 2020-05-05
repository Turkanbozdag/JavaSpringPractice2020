package Day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.setDogInfo("husky","small",4,"white","ghost");
        /*
        Dog dog1=new Dog();
        dog1.breed="husky";
        dog1.size="Small";
        dog1.color="white";
        dog1.name="Ghost";
        dog1.age=4;
        */
        /*
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);

         */

        Dog dog2=new Dog();
        dog2.setDogInfo("alabay","exra big",5,"brown","lucky");

        Dog dog3=new Dog();
        dog3.setDogInfo("poodle","miniature",2,"white","lucky");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println("================================================================================");
        Dog dog4=new Dog();
        dog4.setDogInfo("pomeranian","small",3,"white","lil");
        Dog dog5=new Dog();
        dog5.setDogInfo("pomerian","small",4,"white","ernie");


        ArrayList<Dog>puppies=new ArrayList<>();
        //puppies.addAll(Arrays.asList(dog1,dog2,dog3));
        puppies.removeIf(p->p.age>2);
        for (int i=0;i<puppies.size();i++){
            Dog eachdog=puppies.get(i);
            System.out.println(eachdog);
        }
        System.out.println("===================================");
        puppies.removeIf(p->p.age>2);



    }

}
