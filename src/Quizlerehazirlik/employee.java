package Quizlerehazirlik;

public class employee {
    String name;
    long id;
    long ssn;
    String jobtitle;
    double salary;
    char gender;
    public void setInfo(String name,long id,long ssn,String jobtitle,double salary,char gender){
        this.name=name;
        this.id=id;
        this.ssn=ssn;
        this.jobtitle=jobtitle;
        this.salary=salary;
        this.gender=gender;
    }
    public String toString(){
        return"name:"+name+"id"+id+"ssn:"+ssn+"jobtitle"+jobtitle+"salary"+salary+"gender"+gender;
    }

}
