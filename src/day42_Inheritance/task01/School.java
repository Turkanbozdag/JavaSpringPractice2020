package day42_Inheritance.task01;

import java.util.ArrayList;
import java.util.Arrays;

/*create a class called school:
					create 3 objects of student and set thier info
					create a an ArrayList of students to store all student objects
					use for each loop to print out each students' name and studentID

 */
public class School {//school has A student
    public static void main(String[] args) {


        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setStudentInfo("vildan",123,'F',3455,"testing");
        student2.setStudentInfo("mesut",30,'M',32344,"computer science");
        student3.setStudentInfo("rumeysa",14,'F',4576,"art");


        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(student1, student2, student3));
        for (Student each:studentList){
            System.out.println(each);
    }

    }
}
