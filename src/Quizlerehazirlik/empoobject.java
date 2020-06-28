package Quizlerehazirlik;

public class empoobject {
    public static void main(String[] args) {
         empoo empoo1=new empoo("rustem");
        System.out.println(empoo1);

        empoo empoo2=new empoo("john","mechanic");
        System.out.println(empoo2);


        empoo empoo3=new empoo("saban","QA",123);
        System.out.println(empoo3);

        empoo empoo4=new empoo("turkan","SDET",245,120000);
        System.out.println(empoo4);




    }
}
