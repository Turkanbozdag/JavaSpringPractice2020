package day50_polymorphism;

public class ReferencetypeCasting {
    public static void main(String[] args) {
        int a=100;
        double b=(double)a;//implicitly done here super double
        Dog dog=new Dog("a",1,"f");//larger type one superm
        Animal animal1=(Animal) dog;//upcasting,done implicitly
                        //=dog;boylede tek yazabiliriz
        Cat cat=new Cat("minnos","f",2);
        //Dog dog2=(Dog)cat;
        Animal animal2=(Animal)cat;//upcasting
        System.out.println("=======================");
        double c=10;
        int d=(int)c;//explicity done
        Animal animal3=new Dog("A",6,"f");
        Dog dog3=(Dog)animal3;//dow casting,Must be done manually
           Animal animal4=new Cat("C","F",5);
           Cat cat2=(Cat)animal4;

        System.out.println("========================");
        //referanc Animal we cannot write bark
        Animal animal5=new Dog(" Lucy",3,"f");
        //animal5.bark();
         Dog dog2=(Dog)animal5;
         dog2.bark();
         //second way;
        ((Dog)animal5).bark();
       // Dog dog4=animal5;
       // (Dog)animal5).bark();
    }
}
