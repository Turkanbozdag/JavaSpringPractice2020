package day46_final_abstract;

class final_Variables {
    int InstanceVariable=300;
    //final int InstanceVariable2;///final instance variables need to be initialized imitatly
    static int staticVariables=1000;
    //static int getStaticVariables;

    public static void main(String[] args) {
        final double PI=3.14;
        //PI=3.15;
        final String gender="male";
        //gender="female";
       final int score;
        score=100;
       //score=200;
        System.out.println(score);
        System.out.println("==========================");
        //this.InstanceVariable=400;
        final_Variables obj=new final_Variables();
       // obj.InstanceVariable=400;
        staticVariables=2000;

    }

}
