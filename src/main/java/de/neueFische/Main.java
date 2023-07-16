package de.neueFische;

import java.security.KeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Student stud1 = new Student("Marvin in tha pool", 123);
        Student stud2 = new Student("Clenn in tha house", 234);
        Student stud3 = new Student("Johnny be Good", 239);
        Student stud4 = new Student("Will Tenner", 234);
        ComputerScienceStudent stud5 = new ComputerScienceStudent("Barry Flint", 433, "Java");
        BiologyStudent stud6 = new BiologyStudent("Caroline Key", 109, "TierBiologie");


        /*Student[] studentenArr = new Student[4];
        studentenArr[0] = stud1;
        studentenArr[1] = stud2;
        studentenArr[2] = stud3;
        studentenArr[3] = stud4;
         */

        HashMap<Integer, Student> students = new HashMap<Integer, Student>();
        students.put(stud1.getId(), stud1);
        students.put(stud1.getId(), stud2);


       // students.add(stud1);
        //students.add(stud2);
       // students.add(stud3);
       // students.add(stud4);


        //  StudentDB studentVerw = new StudentDB(studentenArr);
        StudentDB studentVerw = new StudentDB(students);

        /*
        System.out.println(studentVerw.getAllStudents());
        System.out.println(studentVerw.getAllStudents());
         */

        try{

            studentVerw.addStudent(stud5);
            studentVerw.addStudent(stud5);
        }
        catch(Exception ke){
            System.out.println(ke.getMessage());
        }





        try{
            System.out.println(studentVerw.findById(236));
        }
        catch(NoSuchElementException NsEe){
            System.out.println(NsEe.getMessage());

        }


        // System.out.println(studentVerw.randomStudent());

        /*ComputerScienceStudent compStud1 = new ComputerScienceStudent("bla", 12);
        BiologyStudent biologyStud1 = new BiologyStudent("blub", 13, "Humanbiologie");

        System.out.println(compStud1);

        compStud1.ausgabe();
        biologyStud1.ausgabe();

        //Aufruf der aus dem Interface stammenden, in BiologyStud und ComputerScienceStud implementierten Meth.
        compStud1.getAddress();
        compStud1.getIdentityCardNumber();
        biologyStud1.getAddress();
        biologyStud1.getIdentityCardNumber();

         */





    }
}