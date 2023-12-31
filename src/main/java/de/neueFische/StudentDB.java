package de.neueFische;

import java.security.KeyException;
import java.util.*;


public class StudentDB {

    //  private ArrayList<Student> students;
    private HashMap<Integer, Student> students;


    public StudentDB(HashMap<Integer, Student> students) {
        this.students = students;
    }


    public Student findById(int id) {

        if(!students.containsKey(id)){
            throw new NoSuchElementException("No Element found with given ID: "+id);
        }
        else{
          return students.get(id);
        }


    }

    public HashMap<Integer, Student>  getAllStudents() {


        return students;
    }

    // public String toString() {
    //   return getAllStudents().toString();
    //}

    public Student randomStudent() {
        Random r1 = new Random();
        return this.students.get(r1.nextInt(0, students.size()));

    }

    public void addStudent(Student student) throws KeyException{
       if(students.containsKey(student.getId())){
           throw new KeyException("Key "+student.getId()+" already exist and will overwrite the current content!");
       }
       else{
           this.students.put (student.getId(), student);
       }


        //for arrays instead arrayLists...
        //this.students = Arrays.copyOf(this.students, students.size()+1);
        // students[students.size()-1] = student;
    }


}
