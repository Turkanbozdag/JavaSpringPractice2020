package warmupTask;

public class task1 {
    public static void main(String[] args) {
        int statuscode=410;


        if (statuscode==200){
            System.out.println("OK");
        }
        if (statuscode==201){
            System.out.println(" Created");
        }
        if (statuscode==202){
            System.out.println(" Accepted");
        }
        if (statuscode==301){
            System.out.println(" moved permanently");
        }
        if (statuscode==303){
            System.out.println(" see other");
        }
        if (statuscode==304){
            System.out.println(" Not Modified");
        }
        if (statuscode==307){
            System.out.println(" Temporary Redirect");
        }
        if (statuscode==400){
            System.out.println(" Bad Request");
        }
        if (statuscode==401){
            System.out.println("Unauthorized");
        }
        if (statuscode==403){
            System.out.println(" Forbidden");
        }
        if (statuscode==404){
            System.out.println(" Not Found");
        }
        if (statuscode==410){
            System.out.println(" Gone");
        }
        if (statuscode==500){
            System.out.println(" Internal Server Error");
        }
        if (statuscode==503){
            System.out.println(" Service Unavailable");
        }



    }

}
