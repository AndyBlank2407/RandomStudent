package de.neueFische;

public class ComputerScienceStudent extends Student{

    private String programmierSprache;

    public ComputerScienceStudent(String name, int id, String programmierSprache){
        super(name, id);
        this.programmierSprache = programmierSprache;
    }

    public ComputerScienceStudent(String name, int id){
        super(name, id);
    }


}
