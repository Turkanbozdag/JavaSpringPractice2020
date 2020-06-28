package Quizlerehazirlik;

public class CredentialsObject {
    public static void main(String[] args) {

        Credentials facebook = new Credentials();//two object 1username2password
       facebook.setUserName("turkan");
       facebook.setPassWord("123456");

        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassWord());



    }


}
