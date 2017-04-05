package novac;

import java.util.GregorianCalendar;

import menjacnicaInterfejs.MenjacnicaInterfejs;

public class Implementator implements MenjacnicaInterfejs {

	@Override
	public void dodajKursZaDan(GregorianCalendar datum, double kupovni, double srednji, double prodajni) {
		KursIDatum k = new KursIDatum();
		k.setDatum(datum);
		k.setKupovni(kupovni);
		k.setProdajni(prodajni);
		k.setSrednji(srednji);
	}

	@Override
	public void obrisiKursZaDan(GregorianCalendar datum) {
		KursIDatum k = new KursIDatum();
		if(k.getDatum().equals(datum))k=null;
	}

	@Override
	public KursIDatum vratiKursZaDan(GregorianCalendar datum) {
		KursIDatum k = new KursIDatum();
		if(k.getDatum().equals(datum))return k;
		return null;
	}

}
