package officeHours.Practice_04_08_2020;

public class forloop_task {
    public static void main(String[] args) {
        /*
        print all the number between 0~100 that can be divisible by 3or 5
         */
        for (int i=0;i<=100;i++){
            if (i%3==0 || i% 5==0) {
                System.out.println(i + " ");

            }
        }
        System.out.println();
        System.out.println("=========================");

        String name="muhtar";

              String result="";//rathum    012345
            int lastIndex=name.length()-1;//bir azaltmaliyiz yukarizi 6 cikiyo
            for (int i=lastIndex;i>=0;i--){
               result +=result+name.charAt(i);// System.out.println(name.charAt(i));
            }
        System.out.println(result);//we print one time out of loop you put
        if (name.equalsIgnoreCase(result)){
            System.out.println(name+"is not palindrome name");
        }else{
            System.out.println(name+ "is not palindrome name");
        }


    }
}
