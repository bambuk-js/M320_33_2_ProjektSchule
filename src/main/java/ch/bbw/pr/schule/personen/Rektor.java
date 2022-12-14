package ch.bbw.pr.schule.personen;

public class Rektor extends Person{

    public Rektor(String name, String vorname) {
        super(name, vorname);
    }

    @Override
    public String print() {
        return " ist Rektor(in)";
    }

    public String doWork() { return signiertZeugnisse(); }

    public String signiertZeugnisse() { return " signiert Zeugnisse"; }
}
