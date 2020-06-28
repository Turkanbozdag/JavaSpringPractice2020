package Codiiiin;

public class ScrumTeam {
    public static void main(String[] args) {
        String[] DevTeam={"mesut","vildan","rumeysa"};
        String[] Testers={"Turkan","peri","emir","Fatos"};
        String[] Po={"nono","lolo"};

        String[][] ScrumTeam={DevTeam,Testers,Po};
                            //0         1
                ScrumTeam[0][1]="gulo";
        System.out.println(ScrumTeam[0][1]);
        String info=ScrumTeam[1][2];
        System.out.println(info);
        System.out.println("++++++++++++++++++++++++++");
        for (String eachtesters:ScrumTeam[2]){
            System.out.println(eachtesters);
        }
        System.out.println("++++++++++++++++++++++++=======");
        System.out.println(ScrumTeam[2][1]);

    }
}
