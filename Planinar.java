
public abstract class Planinar {
//Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima: 
//jedinstveni celobrojni identifikacioni broj
//ime i prezime 
//Dok od javnih metoda: 
//konstruktor koji postavlja sve atribute klase. 
//gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. 
//posle njihovog postavljanja u konstruktoru)
//apstraktnu metodu štampaj
//apstraktnu metodu koja vraca clanarinu planinara
//apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar 
//upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina. 

	protected int id;
	protected String imeIPrezime;

	public Planinar(int id, String imeIPrezime) {
		this.id = id;
		this.imeIPrezime = imeIPrezime;
	}

	public int getId() {
		return id;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public abstract void stampa();

	public abstract int clanarina();

	public abstract boolean uspesanUspon(Planina p);
}
