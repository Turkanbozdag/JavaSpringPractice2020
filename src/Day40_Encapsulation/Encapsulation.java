package Day40_Encapsulation;

public class Encapsulation {
    private long SSN;


//getter:read only
  public  long getSSN(){
        return SSN;
    }
    //setter
    //write only (public silindi orda once denedik)
     public void setSSN(long SSN){
     //private
        this.SSN=SSN;

    }


}
