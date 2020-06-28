package Quizlerehazirlik;

public class Credentials {
    private String userName;
    private String PassWord;

    public String getUserName(){//get must nmatch dataType
      return userName;  //funcinalite getter is raturn type return the private instance variable


    }                       //instance data type sama
    public void setUserName(String userName){//setterda return type must be void
      this.userName=userName;

    }
    public String getPassWord(){
        return PassWord;
    }
    public void setPassWord(String passWord){
        this.PassWord=PassWord;
    }





}
