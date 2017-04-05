package novac;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.MenjacnicaInterfejs;

public class Implementator implements MenjacnicaInterfejs {

	@Override
<<<<<<< HEAD
	public void dodajKursZaDan(GregorianCalendar datum, double kupovni, double srednji, double prodajni) {
		KursIDatum k = new KursIDatum();
		k.setDatum(datum);
		k.setKupovni(kupovni);
		k.setProdajni(prodajni);
		k.setSrednji(srednji);
=======
	public void dodajKursZaDan(GregorianCalendar datum, double kupovni, double srednji, double prodajni, LinkedList<KursIDatum> lista) {
		KursIDatum k = new KursIDatum();
		k.setDatum(datum);
		k.setKupovni(kupovni);
		k.setProdajni(prodajni);
		k.setSrednji(srednji);
		lista.add(k);
>>>>>>> refs/heads/implementacijainterfejsa
	}

	@Override
<<<<<<< HEAD
	public void obrisiKursZaDan(GregorianCalendar datum) {
		KursIDatum k = new KursIDatum();
		if(k.getDatum().equals(datum))k=null;
=======
	public void obrisiKursZaDan(GregorianCalendar datum, LinkedList<KursIDatum> lista) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getDatum().equals(datum)){
				lista.remove(i);
			}
		}
>>>>>>> refs/heads/implementacijainterfejsa
	}

	@Override
<<<<<<< HEAD
	public KursIDatum vratiKursZaDan(GregorianCalendar datum) {
		KursIDatum k = new KursIDatum();
		if(k.getDatum().equals(datum))return k;
=======
	public KursIDatum vratiKursZaDan(GregorianCalendar datum, LinkedList<KursIDatum> lista) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getDatum().equals(datum)){
				return lista.get(i);
			}
		}
>>>>>>> refs/heads/implementacijainterfejsa
		return null;
	}

}
