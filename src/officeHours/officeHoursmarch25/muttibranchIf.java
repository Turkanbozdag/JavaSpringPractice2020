package officeHours.officeHoursmarch25;

public class muttibranchIf {
    public static void main(String[] args) {
        int number=0;
        if (number>0){//false
            System.out.println("it is pozitive number");
        }else if (number<0){//false
            System.out.println("it is negative");

        }else {
            System.out.println("it is zero");//true
        }

        int num1=100;
        int num2=200;
        if (num1>num2){

        }else if (num2>num1){

        }else{//num1==num2

        }

        System.out.println("===================");
        String browsername=" ";
        if (browsername == "firefox") {

            System.out.println("firefox browser is opening");
        }else if (browsername=="chrome"){

        }else if (browsername=="internet explore"){
            System.out.println("internet  exp");
        }else if (browsername=="safari"){
            System.out.println("safari open");
        }else if (browsername=="opera"){
            System.out.println("opera browser");
        }else{
            System.out.println("invalid");
        }




    }
}
