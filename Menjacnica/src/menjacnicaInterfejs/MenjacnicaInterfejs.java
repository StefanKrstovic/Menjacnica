package menjacnicaInterfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import novac.KursIDatum;

public interface MenjacnicaInterfejs {
	public void dodajKursZaDan(GregorianCalendar datum, double kupovni, double srednji, double prodajni, LinkedList<KursIDatum> lista);
	public void obrisiKursZaDan(GregorianCalendar datum,LinkedList<KursIDatum> lista);
	public KursIDatum vratiKursZaDan(GregorianCalendar datum,LinkedList<KursIDatum> lista);
}
