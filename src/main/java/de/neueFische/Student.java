package de.neueFische;

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

}
