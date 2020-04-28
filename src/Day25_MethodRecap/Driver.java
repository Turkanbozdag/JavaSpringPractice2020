package Day25_MethodRecap;
/*write a return method named getDriver1 that accepts a string parameter called Browser

                if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver

                    Ex: getDriver("chrome");  ==> "Chrome Driver"

                        getDriver("fireFOX"); ==> "FireFox Driver"

                            ....

                if the browser name does not match with any of browsers above, the method should return "Invalid"

                APPLY SWITCH STATEMENTS
//Access-
 */
        public class Driver {
            /*method decleration:
		Access-modifers  Specifier  return-Type  MethodName(paramter){
				statements;

             */
        //return type string here
        public static void main(String[] args) {
        String str=getDriver1("chrome");
            System.out.println(str);
            // getDriver1("firefox");

            String str2=getDriver2("chrome");
            System.out.println(str2);

            String str3=getDriver3("");
            System.out.println(str3);


    }



    public static String getDriver1(String browserName){
        String result = "";
        switch (browserName.toUpperCase()) {//"chromE".toLowerCase
            case "chrome":
                result = "chrome Driver";
                break;
            case "firefox":
                result = "firefox Driver";
                break;
            case "safari":
                result = "safari Driver";
                break;
            case "opera":
                result = "opera Driver";
                break;
            case "edge":
                result = "Edge Driver";
                break;
            default:
                result = "invalid Driver";

        }
        System.out.println(result);
        return result;


    }

public static String getDriver2(String browserName){
            browserName=browserName.toLowerCase();
            String result="";
            if (browserName.equals("chrome")) {
                result = "chrome Driver";
            }else if(browserName.equals("firefox")){
                result="firefox driver";
            }else if(browserName.equals("safari")) {
                result = "safari driver";
            }else if(browserName.equals("edge")){
                result="edge driver";
            }else if(browserName.equals("opera")) {

                result = "opera driver";
            }else{
                result="invalid driver";
            }
            return result;
}

public static String getDriver3(String browserName) {
           browserName=browserName.toLowerCase();
      String result=(browserName.equals("edge"))?"edge Driver"
                :(browserName.equals("firefox"))?"firefox"
            :(browserName.equals("chrome"))?"chrome"
            :(browserName.equals("safari"))?"safari Driver"
            :(browserName.equals("opera"))?"opera Driver":"invalid";

        return result;


}

}
