package de.neueFische;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    StudentDB studVerw1 = new StudentDB(new ArrayList(List.of(new Student("Andy", 5), new Student("Peter", 3))));


    @Test
    void findById_ShouldThrowException_WhenInvalidKeyIsGiven() {
        //Given

        //When_Then
        try {
            studVerw1.findByIndex(2);
            fail("Es wurde kein Exception geworfen");
        } catch (Exception e) {
            assertTrue(true);
        }
        /* //Given
        StudentDB studVerw = new StudentDB();
        studVerw.addStudent(new Student("Andy", 11));
        studVerw.addStudent(new Student("Andyne", 12));

        //When_Then
        try{
            studVerw.findById(14);
            fail();
        }
        catch (NoSuchElementException Nsee){
            assertTrue(true);
        }

        */
    }

    @Test
    public void getAllStudents() {
        //Given
        ArrayList<Student> expected = new ArrayList<>(List.of(new Student("Andy", 5), new Student("Peter", 3)));

        //when
        ArrayList<Student> actual = studVerw1.getAllStudents();

        assertEquals(expected, actual);
    }

    @Test
    public void addStudent() {
        //Given
        Student studX = new Student("Johnny", 7);
        studVerw1.addStudent(studX);

        //Doppeltest: Einmal über BoolenVar, einmal über Vergleich der Arraylist und Rückgabe-List von Methode
        ArrayList<Student> expected = new ArrayList(List.of(new Student("Andy", 5), new Student("Peter", 3)
                , new Student("Tobi", 10)));

        //When

        boolean actual = studVerw1.addStudent(studX);
        //Then
        assertTrue(actual);
        assertEquals(expected, studVerw1.getAllStudents());

    }

    @Test
    public void removeStudent() {
        //Auch Doppeltest gleich wie bei addStudent
        //Given

        //When
        boolean actual = studVerw1.removeStudent(new Student("Andy", 5));


        //Then
        assertTrue(actual);

        assertEquals(List.of( new Student("Peter", 3)), studVerw1.getAllStudents());
    }


}