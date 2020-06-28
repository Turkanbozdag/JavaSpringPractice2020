package day47_Abstraction;

public class ChromeDriver extends RemoteWebDriver{
    @Override
    public void get(String URL){
       // System.out.println("Open Chrome");hoca bunu siliyo 15 tane method yazmiyayim diyo
        System.out.println("Opening "+URL+" in chrome browser");
//why we cannot create objects from abstract class?because it is not concrete,object hos to be concrete body actually exist
//concrete fizikli exist
    }
@Override
    public void quit(){
    System.out.println("Closing the chrome browser");
}





}
