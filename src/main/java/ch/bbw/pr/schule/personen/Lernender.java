package ch.bbw.pr.schule.personen;
/**
 * @author Laura Luethi
 */
public class Lernender extends Person {
	public Lernender(String name, String vorname) {
		super(name, vorname);
	}

	@Override
	public String print() {
		return " ist Lernende(r)";
	}

	public String doWork() { return machtHausaufgaben(); }
	
	public String machtHausaufgaben(){
		return " macht Hausaufgaben ";
	}
}
