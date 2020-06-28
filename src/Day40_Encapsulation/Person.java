package Day40_Encapsulation;

public class Person {
    public String name;
    private long SSN;
    private long ID;
    //      classin name
    public Person(String name){//contructor burasi
        this.name=name;

    }
    //public kaldirisak
   public long getSSN(){
        return SSN;//my getter
    }
    public void setSSN(long SSN){
        this.SSN=SSN;

    }
    public long getID(){return ID;}
       // return ID;

        public void setID(int ID){
           this.ID=ID;
        }
        public void setSSAndID(long SSN,int ID){
        setSSN(SSN);
        setID(ID);
        //or this.SSN=SSN; this.ID=ID;

        }










}
