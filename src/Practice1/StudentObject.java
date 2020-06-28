package Practice1;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setStudentInfo("Adem","Turkey",34,3.5,'M',true);

        Student studen2=new Student();
        studen2.setStudentInfo("Mine","Germany",30,2.5,'F',true);


        Student student3=new Student();
        student3.setStudentInfo("John","Us",39,4.0,'M',false);

        Student student4=new Student();
        student4.setStudentInfo("Lily","Us",29,3.5,'F',false);

        Student[]students={student1,studen2,student3,student4};
        ArrayList<Student>canGraduate=new ArrayList<>(Arrays.asList(students));

        canGraduate.removeIf(p->p.gpa<=3.0);

        System.out.println(canGraduate.size());

        for (int i=0;i<canGraduate.size();i++){
            Student each=canGraduate.get(i);
            System.out.println(each.name+" cangraduate");

        }
        System.out.println("++++++++++++++++++++++++");
        ArrayList<Student>canNotGraduate=new ArrayList<>(Arrays.asList(students));
        canNotGraduate.removeIf(p->p.gpa>3.0);
        System.out.println(canNotGraduate.size());
        System.out.println("=================");
        for(Student each:canNotGraduate){
            System.out.println(each.name+" can not graduate");
        }












    }

}
