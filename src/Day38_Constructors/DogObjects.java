package Day38_Constructors;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        System.out.println(dog1.name);//default null
        System.out.println(dog1.breed);
        System.out.println(dog1.age);//default 0
        System.out.println("================");
        Dog dog2=new Dog("husky");
        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.age);
        System.out.println("++++++++++++++");
        Dog dog3=new Dog("pople",4);
        System.out.println(dog3.name);
        System.out.println(dog3.breed);
        System.out.println(dog3.age);

        System.out.println("@@@@@@@@@@@@@@@");
        System.out.println(dog3);
        System.out.println(dog2);
        System.out.println(dog1);
        System.out.println("-------------------");
        //Dog dog4=new Dog(5,"husky")
    }
}
