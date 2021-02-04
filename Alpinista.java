
public class Alpinista extends Planinar {
//Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. 
//Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario 
//(celobrojna vrednost) i poeni se mogu menjati. 
//Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu
//od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se 
//ispisuju u formatu: 
//Alpinista, id: (id) ime: (ime i prezime) Broj poena: (poeni) 

	private int poeni;

	public Alpinista(int id, String imeIPrezime, int poeni) {
		super(id, imeIPrezime);
		this.poeni = poeni;

	}

	public int getPoeni() {
		return poeni;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	@Override
	public void stampa() {
		System.out.println("Alpinista, Id: " + this.id);
		System.out.println("Ime: " + this.imeIPrezime);
		System.out.println("Broj poena: " + this.poeni);
	}

	@Override
	public int clanarina() {
		return 1500 - this.poeni * 50;
	}

	@Override
	public boolean uspesanUspon(Planina p) {
		if (p.getVisinaPlanine() <= 4000) {
			return true;
		}
		return false;
	}
}