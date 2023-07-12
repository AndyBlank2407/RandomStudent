package de.neueFische;

public class ComputerScienceStudent extends Student implements Citizen{

    private String programmierSprache;


    public void abstractMethodAusgabe(){
        System.out.println("kacka");
    }
    public ComputerScienceStudent(String name, int id, String programmierSprache){
        super(name, id);
        this.programmierSprache = programmierSprache;
    }

    public ComputerScienceStudent(String name, int id){
        super(name, id);

    }

    public String getProgrammierSprache() {
        return programmierSprache;
    }

    @Override
    public void ausgabe(){
        super.ausgabe();
        System.out.println("Und die modifizierte Methode, die aus der Superklasse genommen und in der Kindklasse erweitert wird, geht auch!");
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", ID: " + this.getId()+
                ", ProgrammierSprache='" + this.getProgrammierSprache();
    }
}
