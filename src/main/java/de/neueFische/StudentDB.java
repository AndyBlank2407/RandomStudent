package de.neueFische;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;


public class StudentDB {

    private ArrayList<Student> students;


    public StudentDB(ArrayList students) {
        this.students = students;
    }



    public ArrayList<Student> getAllStudents() {

        return students;
    }

   // public String toString() {
     //   return getAllStudents().toString();
    //}

    public Student randomStudent(){
        Random r1 = new Random();
        return this.students.get(r1.nextInt(0, students.size()));

    }

    public void addStudent(Student student){
        this.students.add(student);

        //for arrays instead arrayLists...
        //this.students = Arrays.copyOf(this.students, students.size()+1);
       // students[students.size()-1] = student;
    }


}
