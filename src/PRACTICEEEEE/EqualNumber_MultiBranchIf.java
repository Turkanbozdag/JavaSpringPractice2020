package PRACTICEEEEE;

public class EqualNumber_MultiBranchIf {
    public static void main(String[] args) {
        double n1=20;
        double n2=19;
        double n3=4;
        boolean n1Equaln2=n1==n2 && n1!=n3;
        boolean n1Equaln3=n1==n3 && n1!=n2;
        boolean n2Equaln3=n2==n3 && n2!=n1;
        boolean allEqual=n1==n2 && n1==n3;

        if (n1Equaln2){
            System.out.println("n1 is equal n3");
        }else if (n1Equaln3){
            System.out.println(" n1 is equal to n3");

        }else if (n2Equaln3){
            System.out.println("n2 is equal to n3");
        }else if (allEqual){
            System.out.println("n1 is equal to n2 and n3");
        }else{
            System.out.println("none of them are equal");
        }
    }
}
