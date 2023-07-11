package de.neueFische;

import java.util.Objects;

public class Student {

    private String name;
    private int id;


    public Student(String name, int id) {
        this.name = name;
        this.id = id;

    }


    public void getName(String name) {
        this.name = name;
    }

    public void getId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Name: "+name+", ID: "+id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
