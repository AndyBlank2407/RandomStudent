package de.neueFische;

public class ComputerScienceStudent extends Student implements Citizen{

    private String programmierSprache;

    public ComputerScienceStudent(String name, int id, String programmierSprache){
        super(name, id);
        this.programmierSprache = programmierSprache;
    }

    public ComputerScienceStudent(String name, int id){
        super(name, id);

    }

    @Override
    public void ausgabe(){
        super.ausgabe();
        System.out.println("Und die modifizierte Methode, die aus der Superklasse genommen und in der Kindklasse erweitert wird, geht auch!");
    }


    @Override
    public String getAddress() {
        System.out.println("Hier kommt die Adresse!");
        return null;
    }

    @Override
    public int getIdentityCardNumber() {
        System.out.println("IdCardNo wurde zurückgegeben");
        return 0;
    }
}
