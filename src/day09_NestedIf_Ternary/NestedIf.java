package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        int age=17;
        boolean Uscitizen=true;
        if(Uscitizen){//nest if burasi pre contion
            if (age>17){//contion1
                System.out.println("you are eligible to vote");
            }else{
                System.out.println("grow up first:)");
            }
        }else{
            System.out.println("only the us citizen are ");//ust calismaza buraya
        }
        System.out.println("==========");
        int score=75;
        String grade="";
        if (score>=0 &&score<=100){
            if (score>90){
                grade="A";

            }else if (score>=80 && score<90){
                grade="B";
            }else if (score>=70){
                grade="C";
            }else if (score>=60){
                grade="D";
            }else{
                grade="f";
            }
        }else {
            grade = "invalid";
        }
        System.out.println(grade);
        System.out.println("=========================");
        //ternary

        int score2=200;
        String grade2="";
        if (score2>-0 && score2<=100){

            grade2=(score>=90)?"A":(score2>=80)?"B":(score2>=70)?"C":(score>=60)?"D":"F";



        }else{
            grade2="invalid";
        }
        System.out.println(grade2);


    }
}
