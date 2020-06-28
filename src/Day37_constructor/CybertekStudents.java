package Day37_constructor;

public class CybertekStudents {
    static String schoolname;
    String studentname;//we must need to know
    int groupnumber;//we must know
    String batch;//we must need know
    public CybertekStudents(String studentname,int groupnumber,String batch){
        schoolname="Cybertek universty";
        this.studentname=studentname;
        this.groupnumber=groupnumber;
        this.batch=batch;
    }
    public String toString(){
        return"name:"+studentname+",batch:"+batch+",in group:"+groupnumber+"school name:"+schoolname;
    }
}


class CObjects{
    public static void main(String[]args){
        CybertekStudents student1=new CybertekStudents("Ayse",3,"batch18");
        System.out.println(student1);
        CybertekStudents student2=new CybertekStudents("saban",4,"batch18");
        System.out.println(student2);
    }

}