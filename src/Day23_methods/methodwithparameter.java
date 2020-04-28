package Day23_methods;

import java.util.Arrays;

public class methodwithparameter {
    public static void main(String[] args) {
        String[] names={"john","Aaron","luoise"};
        int length=names.length;
        String[] namesrev=new String[3];//null,null,null

        namesrev[0]=names[2];
        names[1]=names[1];
        names[2]=names[0];
        System.out.println(Arrays.toString(namesrev));



    }
}
