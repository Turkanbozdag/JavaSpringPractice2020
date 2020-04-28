package Day18_nestedLoops;
/* write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
			a=a-b=7;
			a=a-b=4;
			a=a-b=1;
			count=3; a=1;remainder
 */
public class Divedednumber {
    public static void main(String[] args) {
    int a=15;
    int b=4;
    int count=0;//count the execution of the loop
    while(a>=b){
        a -=b;
        count ++;
        if (b==0){
            System.out.println("b cannot be zero");
        }
    }
        System.out.println(count);
        System.out.println(a);
        //System.out.println("the result is"+count);hoca usttekile ayni fakat farkli yo kullan
        if (a==0){
            System.out.println("the result is"+count);

        }else{
            System.out.println("the result is"+a);
        }








    }
}
