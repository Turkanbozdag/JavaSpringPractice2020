package calis;

public class freeequancy {
    public static void main(String[] args) {
        String str="ABfffffAAAAAAAAafBB";

        char ch='A';



        char[]arr=str.toCharArray();//[A,A,A]
        int count=0;

        for(char each:arr){//3
            if(each==ch){
                count++;

            }
        }

        System.out.println(count);
        String str2="AABBBFFFBBBBBFBBB";
        char ch2='B';
        int num2=freequency(str2,ch2);
        System.out.println(num2);

    }
    public static int freequency(String str,char ch){
        char[]arr=str.toCharArray();
        int count=0;
        for(char each:arr){
            if (each==ch){

            }
        }
        return count;//ne bekliyosan onu yazacan burda saymak niyetimiz ondan count

    }
}
