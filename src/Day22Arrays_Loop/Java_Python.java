package Day22Arrays_Loop;
/*write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)*/
public class Java_Python {
    public static void main(String[] args) {
    String sentence="I like java and javascript";
    int countjava=0;
    int countpython=0;
    String[]words=sentence.split("");//[I like ,java,and javascript]
    for(String each:words){
        if (each.contains("java")){
            countjava++;
        }
        if (each.contains("python")){
            countpython++;
        }
    }
        System.out.println(countjava==countpython);





    }
}
