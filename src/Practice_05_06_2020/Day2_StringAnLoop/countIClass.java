package Practice_05_06_2020.Day2_StringAnLoop;

public class countIClass {
    public static void main(String[] args) {
        String str="java cs java pro";
        System.out.println(str.replace("java","C#"));
        System.out.println(str.replaceFirst("java","#C"));

        int count=0;
        while(str.contains("Java")){
            count++;
            str=str.replaceFirst("java","");
            System.out.println(str);

        }
        System.out.println(count);


        }



    }
