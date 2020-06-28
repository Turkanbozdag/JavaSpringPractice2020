package Codiiiin.Arrays_Loops;

public class java_python {
    public static void main(String[] args) {
        String sentence="I like java and javascript python python";
        int countjava=0;
        int countpython=0;
        String[]words=sentence.split("");



        for (String each:words){
            if (each.contains("java")){
                countjava++;
            }
            if (each.contains("python")){
                countpython++;
            }
        }
        System.out.println(countjava);
        System.out.println(countpython);
        System.out.println(countjava==countpython);


    }





}
