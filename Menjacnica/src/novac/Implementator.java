package novac;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicaInterfejs.MenjacnicaInterfejs;

public class Implementator implements MenjacnicaInterfejs {

	@Override
	public void dodajKursZaDan(GregorianCalendar datum, double kupovni, double srednji, double prodajni, LinkedList<KursIDatum> lista) {
		KursIDatum k = new KursIDatum();
		k.setDatum(datum);
		k.setKupovni(kupovni);
		k.setProdajni(prodajni);
		k.setSrednji(srednji);
		lista.add(k);
	}

	@Override
	public void obrisiKursZaDan(GregorianCalendar datum, LinkedList<KursIDatum> lista) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getDatum().equals(datum)){
				lista.remove(i);
			}
		}
	}

	@Override
	public KursIDatum vratiKursZaDan(GregorianCalendar datum, LinkedList<KursIDatum> lista) {
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getDatum().equals(datum)){
				return lista.get(i);
			}
		}
		return null;
	}

}
