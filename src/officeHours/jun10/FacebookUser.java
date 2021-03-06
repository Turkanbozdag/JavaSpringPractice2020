package officeHours.jun10;
/*

Facebook User:

(*) Create a class for a facebook user which inherits the Social Media class and additional instance variables: username, password, full name, age, and number of friends

(*) Encapsulate all the variables.

(*) Create a constructor which will create a facebook user by taking username and password.

    - If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.

    - Create and assign the the user's person url by taking 'facebook.com/' and adding their username

    - Set the account length to 0

    - Set the platform for "Facebook" using static block

(*) Overload the constructor to accept username, password, and the user’s name.

    - If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’

(*) Overload the constructor to accept username, password, the user’s name, age and number of friends.

    - Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ). If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
 */

public class FacebookUser extends SocialMedia {
//username,password,full name,age,and number of friends
    private String username;
    private String password;
    private String  fullName;
    private int age;
    private int numberOfFriends;
    static {
        platform="facebook";
    }


    public FacebookUser(String username,String password){
        setUsername(username);//java
        setPassword(password);//kesda
        personalUrl="Facebook.com/"+username;
        accountLength=0;

    }
    public FacebookUser(String username,String password,String fullName){
        this(username,password);

    }
//private  void getPassword(){
      //  return password;
//}
    private void setPassword(String password) {
        if (password.contains(username)){
            System.out.println("invalid password,username is in password");
            password="password";
        }
        this.password=password;
    }
private  String getFullName(){
        return fullName;
}
public void setFullName(String fullName){
                        //james bond
        boolean isValid=true;
        String check=fullName.replaceFirst(" ","");
        for (int i=0;i<fullName.length();i++){
            isValid=false;
            break;
    }
}

   // if(isvalid){


   // }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean directMessage(String username, String message) {
        return false;
    }

    @Override
    public boolean createPost(String body) {
        return false;
    }

    @Override
    public void notification(int time) {

    }
    //@Override
    public boolean leaveGroup(String name){
        System.out.println(fullName+"do you really want to leave?"+name);
        return false;
    }
}
