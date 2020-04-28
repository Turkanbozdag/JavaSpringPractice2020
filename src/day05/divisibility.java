package day05;

public class divisibility {
    public static void main(String[] args) {
    int num=65;
   // divisible2==>true/false
    //divisible3==>true/false
        //divisible5==>true/false
        boolean divisibleBy2=num %2==0;
        boolean divisibleBy3=num %3==0;
        boolean divisibleBy5= num % 5==0;
        String result1=num+" is divisible by 2:"+divisibleBy2;//concatetion
        System.out.println(result1);
        String result2= num+" is divisible by 3:"+divisibleBy3;
        System.out.println(result2);
        String result3= num+"is divisible by 5:"+divisibleBy5;
        System.out.println(result3);
       // System.out.println(result1,+ "\n" +result2,+"\n" +result3);
        String  finalresult;


    }




}
