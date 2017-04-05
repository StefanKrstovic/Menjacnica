package novac;

import java.util.LinkedList;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<KursIDatum> kurs = new LinkedList<KursIDatum>();

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if(naziv==null || naziv=="") throw new RuntimeException();
		this.naziv = naziv;
	}

	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}

	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv==null || skraceniNaziv=="") throw new RuntimeException();
		this.skraceniNaziv = skraceniNaziv;
	}

	public LinkedList<KursIDatum> getKurs() {
		return kurs;
	}

	public void setKurs(KursIDatum kurs) {
		if(kurs==null)throw new RuntimeException();
		this.kurs.add(kurs);
	}
	
	
	public boolean equals(Valuta v) {
		return this.getNaziv().equals(v.getNaziv());
	}
	
	@Override
	public String toString() {
		return "Naziv " + this.getNaziv() + " odnosno skraceno " + this.getSkraceniNaziv() + " poslednji unet kurs " + this.getKurs().getLast().getKupovni() + "\\" + this.getKurs().getLast().getSrednji() + "\\" + this.getKurs().getLast().getProdajni();
	}
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
}
