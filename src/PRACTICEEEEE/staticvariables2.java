package PRACTICEEEEE;

public class staticvariables2 {
    int insVariable;// own copy
    static int staticvariable;//teher only one copy

    public static void main(String[] args) {
    staticvariables2 obj1=new staticvariables2();
    obj1.insVariable=300;
    obj1.staticvariable=400;

    staticvariables2 obj2=new staticvariables2();
   // obj2.insVariable
        //System.out.println(obj1.insVariable);
        //System.out.println(obj2.insVariable);

        System.out.println();

       // System.out.println(obj1.staticvariable);
        //System.out.println(obj2.staticvariable);
        System.out.println(staticvariables2.staticvariable);//static can be called through class name
        System.out.println(staticvariable);//instance cannot be called through class name


    }
}
