package de.neueFische;

import java.util.Arrays;
import java.util.Random;

public class StudentDB {

    private Student[] students;


    public StudentDB(Student[] studenten) {
        this.students = studenten;
    }


    public Student[] getAllStudents() {
        return students;
    }

    public String toString() {
        return Arrays.toString(students);
    }

    public Student randomStudent(){
        Random r1 = new Random();
        return students[r1.nextInt(0, students.length)];

    }

    public void addStudent(Student student){
        this.students = Arrays.copyOf(this.students, students.length+1);
        students[students.length-1] = student;
    }


}
