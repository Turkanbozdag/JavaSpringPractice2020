package Day21;

import java.text.DecimalFormat;

public class FormatingDecimal {
    public static void main(String[] args) {
        DecimalFormat DF=new DecimalFormat("0.00");//rounding decimals

        double a=10/3.0;
        System.out.println(a);
        System.out.println(DF.format(a));






    }
}
