import java.util.ArrayList;

public class PlaninarskiDom {
//Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//naziv doma 
//godinu kada je osnovan. 
//članove doma koji su planinari (klasa vodi računa o nizu) 
//Dok od javnih: 
//default-ni konstuktor i konstuktor koji postavlja sve parametre 
//gettere i settere koji su potrebni 
//metodu učlani planinara, koja dodaje planinara u niz 
//metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu 
//(metoda za parametar prima Planinu za koju se proverava informacija) 
//metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju 
//metodu koja štampa podatke o domu i o svim članovima doma
//metodu koja racuna i vraca mesecni prihod od clanarina svih planinara

	private String nazivDoma;
	private int godinaOsnivanja;
	private ArrayList<Planinar> niz;

	public PlaninarskiDom() {
		this.niz = new ArrayList<Planinar>();
	}

	public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
		this.nazivDoma = nazivDoma;
		this.godinaOsnivanja = godinaOsnivanja;
		this.niz = new ArrayList<Planinar>();
	}

	public String getNazivDoma() {
		return nazivDoma;
	}

	public void setNazivDoma(String nazivDoma) {
		this.nazivDoma = nazivDoma;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public void setGodinaOsnivanja(int godinaOsnivanja) {
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public ArrayList<Planinar> getNiz() {
		return niz;
	}

	public void uclaniPlaninara(Planinar planinar) {
		this.niz.add(planinar);
	}

	public int brojUspesnoPopelih(Planina p) {
		int counter = 0;
		for (int i = 0; i < niz.size(); i++) {
			if (this.niz.get(i).uspesanUspon(p) == true) {
				counter = counter + 1;
			}
		}
		return counter;
	}

	public void izbaciPlaninara(int id) {
		for (int i = 0; i < niz.size(); i++) {
			if (this.niz.get(i).getId() == id) {
				niz.remove(i);
			}
		}
	}

	public void stampa() {
		System.out.println("Naziv doma: " + this.nazivDoma);
		System.out.println("Godina osnivanja planinarskog doma: " + this.godinaOsnivanja);
		for (int i = 0; i < niz.size(); i++) {
			this.niz.get(i).stampa();
		}
	}

	public int mesecniPrihod() {
		int suma = 0;
		for (int i = 0; i < niz.size(); i++) {
			suma = suma + this.niz.get(i).clanarina();
		}
		return suma;
	}
}