package officeHours.Practice_05_20_2020;



class test{
    public test(int a){
        System.out.println("A");

    }

}
public class constructor extends test {
    public constructor(){//AB
        //this(10);
        super(10);//print A than B
        System.out.println("B");
    }

    public static void main(String[] args) {
        constructor obj= new constructor();
    }

}
