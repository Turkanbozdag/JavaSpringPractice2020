package PRACTICEEEEE;

public class dogObject {
    public static void main(String[] args) {
        Dog1 dog1=new Dog1("fhfjh");
        System.out.println(dog1.name);//unknown
        System.out.println(dog1.breed);//unknown
        System.out.println(dog1.age);//0



        Dog1 dog2=new Dog1 ("husky");
        System.out.println(dog2.name);//unknown
        System.out.println(dog2.breed);//husky
        System.out.println(dog2.age);//0
        System.out.println("==========================");
        Dog1 dog3= new Dog1("poodle",4);

        System.out.println(dog3.name);


    }
}
