package Day36_staticBlock;

import Day34_CustomClass.Tester;

import javax.imageio.stream.ImageInputStream;

public class StatickBlock2 {
    static int a;
    static int b;
    int c;

    static Tester tester1 = new Tester();

    public static void main(String[] args) {
        System.out.println(tester1);
    }

    static {
        a = 100;
        b = 200;

        if (100 > 200) {
            a = 100;
        } else {
            b = 200;
        }

        tester1.setTesterInfo("ayse", 3234, "tester", 7878);


    }
}
