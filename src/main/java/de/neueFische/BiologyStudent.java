package de.neueFische;

public class BiologyStudent extends Student{

    String schwerPunktFachrichtung = "";


    public BiologyStudent(String name, int id, String schwerPunktFachrichtung) {
        super(name, id);
        this.schwerPunktFachrichtung = schwerPunktFachrichtung;
    }


}
