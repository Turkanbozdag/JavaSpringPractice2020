package Codiiiin;

public class Zoo {
    public static void main(String[] args) {
        String[]wildAnimals={"tiger","lion","monkey","turtle"};
        String[]birds={"eagle","ducks","peacock","chicken"};

        String[][]zoo={wildAnimals,birds};

        String kfc=zoo[1][3];
        System.out.println(kfc);
        System.out.println("*************");
        for (String eachbirds:zoo[1]){//4times
            if (eachbirds.equals("chicken")){
                continue;
            }
            System.out.println(eachbirds);

        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
        for (String each:zoo[1]){
            System.out.println(each);
        }







    }
}
