package officeHours.practiceoffice03_18_2020;

public class unaryOperators_prac {
    public static void main(String[] args) {
        //post:first passes the value
        int a=20;
        System.out.println(a++);//20
        System.out.println(a);//21
        int b=30;
        int c=b--;//hemen degismiyorb=29 now
        System.out.println(b);
        System.out.println(c);
        //pre incraement immediately place operator bfor the vali name
        int G=200;
        int F=++G;
        System.out.println(F);

        int Z=100;//101,100,99,100
        Z=Z++ +--Z-Z--+ ++Z;
        //100+100-100+100
        System.out.println(Z);

        int u=900;//901,902,903
        int r=-++u+ ++u + -u++;
        //-901+902+-902
        //1+-902
        //1-902==>-901
        System.out.println(r);
        System.out.println(u);


    }




}
