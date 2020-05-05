package Day33_CustomClass;

public class catObject {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        cat1.setCatInfo("Sasha","white",2,"siemes");
        System.out.println(cat1);
        Cat cat2 =new Cat();
        cat2.setCatInfo("Scottish","Beige",7,"Bobo");
        Cat cat3=new Cat();
        cat3.setCatInfo("Calioco","brown-white",6,"cinnamoon");
        System.out.println("==================");
        cat1.sleep();
        cat2.sleep();
        cat3.sleep();
        System.out.println("==================");
        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("sish kabab");
        System.out.println("===================");
        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");
    }
}
