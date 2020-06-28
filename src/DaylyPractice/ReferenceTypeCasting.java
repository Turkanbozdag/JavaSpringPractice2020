package DaylyPractice;

public class ReferenceTypeCasting {
            public static void main(String[] args) {
                int a=100;
                double b=(double)a;//implicitly done upcasting mean casting frob sub class
                Dog dog=new Dog("a",1,"f");
                Animal animal1=(Animal)dog;//upcasting,done implicitly
                Cat cat=new Cat("r","femal",4);
                Animal animal2=cat;//upcasting,done impilitly
                System.out.println("==============================================");
                double c=10;
                int d=(int)c;//explicitly done
                Animal animal3=new Dog("A",2,"F");
                Dog dog3=(Dog)animal3;//down casting ,must be done manually
                Animal animal4=new Cat("C","Female",6);
                Cat cat2=(Cat)animal4;
                System.out.println("====================================================");
                Animal animal5=new Dog("lucy",3,"Femal");
                //animal5.bark();
                Dog dog2=(Dog)animal5;
                dog2.bark();
                //second way:
                ((Dog)animal5).bark();//bu satir ile 24.satir aynisi sadece orada fazla satir yaxdik



            }




}
