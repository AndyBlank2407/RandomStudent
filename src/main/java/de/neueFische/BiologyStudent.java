package de.neueFische;

public class BiologyStudent extends Student implements Citizen{

    String schwerPunktFachrichtung = "";

    public void abstractMethodAusgabe(){
        System.out.println("hallo");
    }

    public BiologyStudent(String name, int id, String schwerPunktFachrichtung) {
        super(name, id);
        this.schwerPunktFachrichtung = schwerPunktFachrichtung;
    }


    @Override //Einbindung aus Interface eigentlich nicht nötig, weil wir von Student erben und da schon
    public String getAddress() {//die Getter und Setter dieser zwei Attribute sind, darum meckert
        System.out.println("Adresse ist jetzt bekannt");//Comp in ComputerScienceStudent auch nicht,
        return null;                                       //wenn wir Meth nicht implementieren...
    }

    @Override
    public int getIdentityCardNumber() {
        System.out.println("IdCardNo ist jetzt bekannt");
        return 0;
    }
}
