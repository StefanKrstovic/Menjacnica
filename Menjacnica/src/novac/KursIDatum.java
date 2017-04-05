package novac;

import java.util.GregorianCalendar;

public class KursIDatum {
	private double prodajni;
	private double kupovni;
	private double srednji;
	private GregorianCalendar datum;

	public double getProdajni() {
		return prodajni;
	}

	public void setProdajni(double prodajni) {
		if(prodajni<=0)throw new RuntimeException();
		this.prodajni = prodajni;
	}

	public double getKupovni() {
		return kupovni;
	}

	public void setKupovni(double kupovni) {
		if(kupovni<=0)throw new RuntimeException();
		this.kupovni = kupovni;
	}

	public double getSrednji() {
		return srednji;
	}

	public void setSrednji(double srednji) {
		if(srednji<=0)throw new RuntimeException();
		this.srednji = srednji;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		if(datum==null)throw new RuntimeException();
		this.datum = datum;
	}
	

	public boolean equals(KursIDatum kid) {
		if(this.getKupovni()==kid.getKupovni() && this.prodajni==kid.getProdajni() && this.getSrednji()==kid.getSrednji())return true;
		return false;
	}

	public String toString() {
		return "Kurs za datum " + this.getDatum().getTime() + " je " + this.getKupovni()+ "\\" + this.getSrednji() + "\\" + this.getProdajni();
	}
	
	
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
