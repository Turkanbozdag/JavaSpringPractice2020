package Codiiiin.classForAnimal;

public class House {
    public static void main(String[] args) {
        Dog dog1=new Dog("karabas",5,"black"," large "," Husky ");
       // dog1.setInfo("karabas",5,"black","large","Husky");
        System.out.println(dog1);
        Dog dog2=new Dog("lolo",3,"white"," small "," minino ");
        System.out.println(dog2);

dog2.bark();
//dog2.scratch();
        System.out.println("==============================");

        cat cat1=new cat();
        cat1.setInfo(" pamuk",3," white"," small"," rangd");
        System.out.println(cat1);
        //cat1.bark();
        System.out.println("====================================");
        Bunny bunny1=new    Bunny("Bug",2,"black","small","tiny");
        System.out.println(bunny1);


    }




}
