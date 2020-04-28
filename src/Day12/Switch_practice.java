package Day12;

public class Switch_practice {
    public static void main(String[] args) {
        switch(3){
            case 1:
            System.out.println("case 1");
            break;

            case 2:
                System.out.println("case2");
                break;
            default:
                System.out.println("invalid");
        }

        System.out.println("========================");
       // 200=ok
       // 201=created
                //202=accepted

        int statuscode=404;
        switch(statuscode){
            case 200:
                System.out.println("ok");
                break;
            case 201:
                System.out.println("created");
                break;
            case 202:
                System.out.println("accepted");
                break;
            default:
                System.out.println("invalid status code");

        }










    }

}
