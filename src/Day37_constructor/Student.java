package Day37_constructor;

public class Student {
    //name,age,and university
    String name;
    int age;
    char gender;
    String university;
    public Student(String name, int age,char gender,String university){//constructor
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.university=university;
    }




    public void setInfo(String name, int age,char gender,String university){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.university=university;
    }
    public String toString(){
        return "name:"+name+"age:"+age+"gender:"+gender+"universty:"+university;
    }






}
