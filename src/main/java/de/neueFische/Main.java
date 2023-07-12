package de.neueFische;

import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("Marvin in tha pool", 123);
        Student stud2 = new Student("Clenn in tha house", 234);
        Student stud3 = new Student("Johnny be Good", 239);
        Student stud4 = new Student("Will Tenner", 234);
        Student stud5 = new Student("Barry Flint", 433);

        /*Student[] studentenArr = new Student[4];
        studentenArr[0] = stud1;
        studentenArr[1] = stud2;
        studentenArr[2] = stud3;
        studentenArr[3] = stud4;
         */

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);


        //  StudentDB studentVerw = new StudentDB(studentenArr);

        StudentDB studentVerw = new StudentDB(students);

        System.out.println(studentVerw.getAllStudents());
        studentVerw.addStudent(stud5);
        System.out.println(studentVerw.getAllStudents());
        System.out.println(studentVerw.randomStudent());

        ComputerScienceStudent compStud1 = new ComputerScienceStudent("bla", 12);
        BiologyStudent biologyStud1 = new BiologyStudent("blub", 13, "Humanbiologie");

        System.out.println(compStud1);

        compStud1.ausgabe();
        biologyStud1.ausgabe();

        //Aufruf der aus dem Interfac in BiologyStud und ComputerScienceStud implementierten Meth.
        compStud1.getAddress();
        compStud1.getIdentityCardNumber();
        biologyStud1.getAddress();
        biologyStud1.getIdentityCardNumber();


    }
}