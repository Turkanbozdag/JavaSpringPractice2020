package officeHoursMay13;

public class instancetest {
    public static void main(String[] args) {
        instance obj1=new instance();
        obj1.name="muhtar";
        instance obj2=new instance();
        obj2.name="kuzzat";
        System.out.println(obj1.name);//muhtar
        System.out.println(obj2.name);//null

        obj1.printName();//name is muhtar

        obj2.printName();





    }


}
class  instanceblock{
    public static void main(String[] args) {
        instance obj=new instance();
        System.out.println(obj.name);
    }
}
