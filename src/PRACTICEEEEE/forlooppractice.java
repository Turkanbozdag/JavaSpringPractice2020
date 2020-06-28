package PRACTICEEEEE;

public class forlooppractice {
    public static void main(String[] args) {

/*odd number bteween 0~100

 */
String result="";
for (int number=0;number<=100;number+=2){
  //  System.out.print(number+" ");
    result+=number+" ";
}
        System.out.println(result);
String resulteven="";
for (int number=2;number<=100;number+=2){
    resulteven+=number+" ";
}

        System.out.println("++++++++++++++++++++++++++++");
String str="Abdullahinoglu MuhammetMustafa";
int lastindexnum=str.length()-1;
for (int i=lastindexnum;i>=0;i--){
    System.out.println(str.charAt(i));
}
/*
write program to polindrome
 */


    }

}
