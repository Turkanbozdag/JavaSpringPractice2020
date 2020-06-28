package Quizlerehazirlik;

public class empoo {
    String name;
    String jobtitle;
    long id;
    double salary;
    char gender;
    public empoo(String name){
        this.name=name;

    }
    public empoo(String name,String jobtitle){
        this(name);
        this.jobtitle=jobtitle;
    }
public empoo(String name,String jobtitle,long id){
        this(name,jobtitle);
      //  this.name=name;
       // this.jobtitle=jobtitle;
        this.id=id;
}
public empoo(String name,String jobtitle,long id,double salary){
        this(name,jobtitle,id);
        this.salary=salary;
}




}
