package Practice1.task02;

import java.util.ArrayList;
import java.util.Arrays;

public class School {//school has a student
    public static void main(String[] args) {
        Student student1=new Student();
        Student student2=new Student();
        Student student3= new Student();
        Student student4=new Student();

        student1.setStudentInfo("turkan",30,'F',2374395,"Testing");
        student2.setStudentInfo("vildan",31,'F',356,"Testing");
        //student3.setPersonInfo("mesut",19,'M',2388,"testing");
       // student4.setPersonInfo("Rumeysa",18,'F',565,"soccer");


        ArrayList<Student>studentlist=new ArrayList<>();
        studentlist.addAll(Arrays.asList(student1,student2,student3));

         for(Student each:studentlist){
             //System.out.println(each);
             System.out.println("name: "+each.name+", ID:"+each.studentId);
         }




    }
}
