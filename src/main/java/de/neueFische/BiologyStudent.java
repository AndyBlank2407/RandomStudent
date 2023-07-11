package de.neueFische;

public class BiologyStudent extends Student implements Citizen{

    String schwerPunktFachrichtung = "";


    public BiologyStudent(String name, int id, String schwerPunktFachrichtung) {
        super(name, id);
        this.schwerPunktFachrichtung = schwerPunktFachrichtung;
    }


    @Override
    public String getAddress() {
        System.out.println("Adresse ist jetzt bekannt");
        return null;
    }

    @Override
    public int getIdentityCardNumber() {
        System.out.println("IdCardNo ist jetzt bekannt");
        return 0;
    }
}
