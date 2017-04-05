package menjacnicaInterfejs;

import java.util.GregorianCalendar;

import novac.KursIDatum;

public interface MenjacnicaInterfejs {
	public void dodajKursZaDan(GregorianCalendar datum, double kupovni, double srednji, double prodajni);
	public void obrisiKursZaDan(GregorianCalendar datum);
	public KursIDatum vratiKursZaDan(GregorianCalendar datum);
}
