package Day13;
/*




 write a java program that can convert any given numbers between 0 ~ 9 to words,
  if the number is greater than 9 or less than zero, out put should be "Invalid".MUST use Scanner and switch statement


 */


import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a nember between 0-9");
        int num =input.nextByte();
        String result="";

        switch(num){
            case 0:result="zero";
            break;
            case 1:result="two";
            break;
            case 3:result="three";
            break;
            case 4:result="four";
            break;
            case 5:result="five";
            break;
            case 6:result="six";
            case 7:result="seven";
            break;
            case 8:result="eight";
            break;
            case 9:result="nine";
            break;
            default:result="invalid";

        }
        System.out.println(result);// out parantezden sonra yaz



         String result2=(num==0)?"zero":(num==1)?"one":(num==2)?"two":(num==3)?"three":(num==4)?"four":(num==5)?"five":(num==6)?"six":(num==7)?"seven":(num==8)?"eight":(num==9)?"nine":"invalid";
        System.out.println(result2);

    }

    public static class StringManipulation3 {
        public static void main(String[] args) {
            String str="I like java programming john";
            //index number of j very first macthing bosluguda sayiyoz
                int num1=str.indexOf("john");//ismi yazdik hangi sayida kacincida gosterdi.
            System.out.println(num1);

            String str2="cybertek school is awesome";
            //           0123456789
            int firstS=str2.indexOf("s");//19
            int secondS=str2.indexOf("is")+1;//s de aldik 1 ekleyerek
            System.out.println(firstS);
            System.out.println(secondS);

            int maxindexnumber="cybertek".length()-1;//8-1
            System.out.println(maxindexnumber);

            String names="muhtar";
            int a1=names.indexOf("good guy");
            System.out.println(a1);//-1 cikti value is not exist

            String fullname=" Kuzzat Altay";//space onemli burda
            String firstname=fullname.substring(0, fullname.indexOf("") );
            String lastname=fullname.substring( fullname.indexOf("")+1);
            System.out.println(firstname);
            System.out.println(lastname);









        }
    }
}
