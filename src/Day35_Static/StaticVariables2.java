package Day35_Static;

public class StaticVariables2 {
    int insVariable;//
    static int staticVariable;

    public static void main(String[] args) {
        StaticVariables2 obj1=new StaticVariables2();
        obj1.insVariable=300;
        obj1.staticVariable=400;

        StaticVariables2 obj2=new StaticVariables2();

        System.out.println(obj1.insVariable);//300
        System.out.println(obj2.insVariable);//0

        System.out.println(obj1.staticVariable);//400
        System.out.println(obj2.staticVariable);//400
        System.out.println();
        //stem.out.println(staticVariable2.staticvaabl);//static can be called throu class name }













    }

        }




