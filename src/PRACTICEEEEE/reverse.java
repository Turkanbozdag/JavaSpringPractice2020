package PRACTICEEEEE;

public class reverse {
    public static void main(String[] args) {
        String str="turkan";
        //          0123

        String reverse1=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
        String reverse2=str.substring(3)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1);
        System.out.println(reverse1);
        System.out.println("=================================================");
        String ta="A";
        ta=ta.concat("B");
        String tb="C";
        ta=ta+tb;
        System.out.println(ta);


    }

}
