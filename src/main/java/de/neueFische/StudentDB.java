package de.neueFische;

import java.util.*;


public class StudentDB {

    //  private ArrayList<Student> students;
    //private HashMap<Integer, Student> students = new HashMap<Integer, Student>();
    private ArrayList<Student> students;

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }


    public Student findById(int id) {

        return students.get(id);

  /*      if(!students.containsKey(id)){
            throw new NoSuchElementException("No Element found with given ID: "+id);
        }
        else{
          return students.get(id);
        }

   */
    }

    public ArrayList<Student> getAllStudents() {


        return students;
    }

    // public String toString() {
    //   return getAllStudents().toString();
    //}

    public Student randomStudent() {
        Random r1 = new Random();
        return this.students.get(r1.nextInt(0, students.size()));

    }

    public void addStudent(Student student) {
        this.students.add (student);

        //for arrays instead arrayLists...
        //this.students = Arrays.copyOf(this.students, students.size()+1);
        // students[students.size()-1] = student;
    }


}
