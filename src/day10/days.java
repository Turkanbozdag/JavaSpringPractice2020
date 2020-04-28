package day10;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
write a program that can display the days based on the numbers 1 ~ 7			MUST USE NESTED IF

 */
public class days {
    public static void main(String[] args) {

    int num=9;
    String result="";
    String result2="";

    if (num>0 && num<8){
        //result=(num==1)?"monday":
        if (num==1){
            result="monday";
        }else if (num==2){
            result="tuesday";

        }else if (num==3){
            result="wednesday";
        }else if (num==4){
            result="thursday";
        }else if (num==5){
            result="friday";
        }else if (num==6){
            result="saturday";
        }else{
            result="sunday";
        }
        if (num>0 && num<8){
            result2=(num==1)?"monday":(num==2)?"tuesday":(num==3)?"wednesday":(num==4)?"thursday":(num==5)?"friday":(num==6)?"saturday":(num==7)?"sunday":"invalid";//short cut (ternary)
        }
    }else {
    }
        System.out.println("invalid");
    System.out.println(result);

        System.out.println(result2);

        String result3="";
        result3=(num==1)?"monday":(num==2)?"tuesday":(num==3)?"wednesday":(num==4)?"thurday":(num==5)?"friday":(num==6)?"sturday":"sunday";//this way better











}


}
