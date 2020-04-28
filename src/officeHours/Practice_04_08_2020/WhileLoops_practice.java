package officeHours.Practice_04_08_2020;

public class WhileLoops_practice {
    public static void main(String[] args) {
    /*
    while(cindition){//condition true while statemen repeat ove over again
    repeted if statement
     */
        for (int i = 0; i < 5; i++) {//5 times work
            System.out.println("helloooo");

        }
        System.out.println("===========");
        int z = 0;
        while (z < 5) {//condition false stop while
            z++;
            System.out.println("hello cybertek");
            //z++ istedigin yere koy lopp icinde
        }
        System.out.println("========================");
        int j = 0;
        while (j <= 100) {
            if (j % 15 == 0) {
                System.out.println(j + "");
                j++;
            }
        }
    }
}