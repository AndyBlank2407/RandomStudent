package de.neueFische;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.security.KeyException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    Student studX = new Student("Alex", 12);

    StudentDB studVerw = new StudentDB(new HashMap<Integer, Student>(Map.of(studX.getId(), studX)));



    @Test
    void addStudent_ShouldThrowException_WhenIdIsalreadyUsed(){
        //Given


        //When-Then
       try{
           studVerw.addStudent(new Student("Andyne",12));
           fail();
       }
       catch(KeyException ke){
           assertTrue(true);
           System.out.println(ke.getMessage());
       }



    }



    @Test
    void findById_ShouldThrowException_WhenInvalidKeyIsGiven() {
        //Given


        //When_Then
        try {
            studVerw.findById(14);
            fail();
        } catch (NoSuchElementException Nsee) {
            assertTrue(true);
        }

    }

}