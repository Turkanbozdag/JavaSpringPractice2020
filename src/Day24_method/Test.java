package Day24_method;
import Resources.Library;
import java.util.Arrays;
import Resources.Library;

public class Test {
    public static void main(String[] args) {
        String str = "Turkan";
       String RevStr= Library.Reverse2(str);
        System.out.println(RevStr);
        int[]arr={5,9,10,3,2,-1};
        arr=Library.sortDesending( arr);
        System.out.println(Arrays.toString(arr));


    }
}