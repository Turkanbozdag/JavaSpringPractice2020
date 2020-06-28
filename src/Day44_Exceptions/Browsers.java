package Day44_Exceptions;
/*warmup task:

    1. create a class called Browsers

            actions: openBrowser():prints "opens the default browser"

                     closeBrowser(): closes the default browser

    2. create a class called ChromeBrowser

            actions: openBrowser(): opens the chrome browser

                     closeBrowser(): closes the chrome browser

    3. creata a class called FirefoxBrowser

            actions: openBrowser(): opens the Firefox browser

                     closeBrowser(): closes the Firefox browser

    4. create a class called Opera browser

            actions: openBrowser(): opens the Opera browser

                     closeBrowser(): closes the Opera browser

    5. create a class called Test:

            create an object of each browsers and call the openBrowser & closeBrowser actions

    create all those classes in one java file
 */
public class Browsers {
    protected void openBrowser() {
        System.out.println("opening the default browser");
    }

    protected void closeBrowser() {
        System.out.println("closing the default browse");
    }


    static class ChromeBrowser extends Browsers {
    }

    static class FirefoxBrowser extends Browsers {
        @Override
        public void openBrowser() {
            System.out.println("opening the firefox browser");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing the firefox browser");


        }

    }
    //burda protectede da kullanabilirsin


    static class Test {
        public static void main(String[] args) {
            ChromeBrowser obj = new ChromeBrowser();
            obj.openBrowser();
            obj.closeBrowser();
            System.out.println("=================================");
            // public static void main (String[]);
            FirefoxBrowser obj2 = new FirefoxBrowser();
            obj2.openBrowser();
            obj2.closeBrowser();

        }
    }

}
