package day08_IfStatements;

public class daysinMonth_MultiBranchif {
    public static void main(String[] args) {
        byte months=1;
        String result="";
        if (months==1) {
            result = "January has 31days";
        }     else if (months==2) {
            result = "february has 28 or29days";
        }else if (months==3){
            result="march has 31days";
        }else if (months==4){
            result="april has 30 days";
        }else if(months==5){
            result="may has 31 days";

        }else if (months==6){
            result="june has 30 days";}
        else if (months==7){
            result="july has 31days";

        }else if (months==8){
            result="august has 31 days";
        }else if (months ==9){
            result="september has 30 days";
        }else if (months==10){
            result="october has 31 days";
        }else if (months==11){
            result="november has31 days";
        }else if (months==12) {
            result = "december has 31 days";
        }else{
            result="invalit entry";}
        System.out.println(result);












    }










}
