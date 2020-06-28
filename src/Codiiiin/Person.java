package Codiiiin;

public class Person {
    public String name;
    private long SSN;
    //private  long ID;
    private  int ID;

    public Person(String name){
        this.name=name;
    }
    public long getSSN(){
        return SSN;
    }
    public void setSSN(long SSN) {
        this.SSN = SSN;
    }
        public int getID(){ return ID;}

        public void setID(int ID){
        this.ID=ID;
    }
    public void setSSNandID(long SSN,int ID){
            setSSN(SSN);//this.SSN=SSN;iki yontemde ayni hangisi kolaysa onu yaz
            setID(ID);//this.ID=ID;


    }
    }

