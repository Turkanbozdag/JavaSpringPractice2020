package officeHours.Practice_04_08_2020;

public class Do_whileLoop {
    public static void main(String[] args) {
        /*
        do{
            statement;
        }while(contion);
        execution order
        1 statements;
        2 condition
        if true:repeats step1
        if false:stops the loop
        */
        boolean b=false;//calismyacak,true sonsuza kadar calisacak
        while(b){
            System.out.println("hello wold");
        }
        System.out.println("=========================================");
        do{

            System.out.println("hello cybertek");
        }while(b);
        System.out.println("========");
        int j=0;
        do{
            if (j % 15==0) {
                System.out.println(j + " ");
            }

            System.out.println(j);

            j++;
        }while(j<=100);












    }
}
