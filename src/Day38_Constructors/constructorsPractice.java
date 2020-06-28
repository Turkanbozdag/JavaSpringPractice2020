package Day38_Constructors;

public class constructorsPractice {
    public  constructorsPractice(){
        this(10.0);//C
        System.out.println("A");
        //this(05);rule num3
    }
    public  constructorsPractice(int a){
        this();//C A executed
        //this(10.5);//just one constroctur bi tane sececeksin iki tane olmaz
        System.out.println("B");//B executed
    }
    public  constructorsPractice(double a){
       // this();zaten yukarda contac yapilmis line5 de rule#5
        //this(5.5);
        //this(10);
        System.out.println("C");
    }

    public static void main(String[] args) {
        new constructorsPractice(10);
    }
}
