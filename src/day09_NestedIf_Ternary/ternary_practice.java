package day09_NestedIf_Ternary;

public class ternary_practice {

    public static void main(String[] args) {
        //char ch1='+';
        //System.out.println(ch1);
        int number=100;
        char ch1=' ';
        if (number>0){
            ch1='+';
        }else if (number<0){
            ch1='-';
        }else{
            ch1='0';
        }
        char ch2=(number>0)?'+':(number<0)?'-':'0';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch1+ch2);
        System.out.println("====================");

        byte score=90;
        String grade="";
        if (score>=90 && score<=100) {
            grade = "Excellent";
        }   else if (score>=80 && score<90){
            grade="B";

        }else if (score>=70 && score<80){
            grade="great";

        }else if (score>=60 && score<70){
            grade="pass";

        }else if (score>60 && score>0) {
            grade = "failed";
        } else{
                grade="invalid";
            }

            String grade2=(score>=90 && score<=100)?"excellent":(score>=80 && score<=90)?"B":(score>=70 && score<80)?"great":(score>=60 && score<70)?"pass":(score<60 && score>0)?"failed":"invalid";
        System.out.println(grade);
        System.out.println(grade2);










    }
}
