package DaylyPractice;

public class Animalobjects {
    public static void main(String[] args) {
        Dog obj1=new Dog("Lucy",5,"female");//Dog class yaziyoduk polinom sonra super classda referans edebiliyoz
        System.out.println(obj1.dogName);
        obj1.bark();
        Animal obj2=new Dog("karabas",4,"f");
        //referans type //obje
        //System.out.println(obj2.dogName);
        //obj2.bark();
        obj2.eat();
        obj2.methodA();//if methods is not overriding reference out print if it overriding object will out
        //if method is exist in both object type &reference Type:if method is overriden:object Type
        //if not:reference Type
        //List<WebElement>list=new ArrayList<>();

        Animal animal1=new Cat("minnos","f",1);
        boolean isCat=animal1 instanceof Cat;
                       //reference name
        System.out.println(isCat);
        Animal d1=new Dog("A",1,"F");
        //boolean r1=d1 instanceof Cat;//there is no relation between cat and dog instanceof give boolean
        Animal animal2=new Cat("Q","F",2);
        boolean r2=animal2 instanceof Animal;//animal is animal diyoz burda
        System.out.println(r2);

    }




}
