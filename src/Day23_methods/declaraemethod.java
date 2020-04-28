package Day23_methods;

public class declaraemethod {
    // access-modifer specifier return-type method name(){
    //statements;
    /*
    step1:hello cybertek
    step2: helo world5 times
    step3:hello btach18
    step4:hello world 5times
    step5:hello saim
     */


    public static void main(String[] args) {//1
        printHello5Times();
    }                   //metod name()
    public static void printHello5Times() {//2.
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }
    }
}
