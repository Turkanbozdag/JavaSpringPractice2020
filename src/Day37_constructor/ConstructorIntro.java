package Day37_constructor;

public class ConstructorIntro {
    //public method(){//constructor name must be same with class name
        public ConstructorIntro(int a){
            System.out.println("constructor with parameter of int");
    }
    public static void main(String[] args) {
        //ConstructorIntro obj=new ConstructorIntro();//default constructor//object must be with existing constructor
        ConstructorIntro obj2= new ConstructorIntro(10);
        ConstructorIntro obj3= new ConstructorIntro(10);






    }
}
