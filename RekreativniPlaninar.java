
public class RekreativniPlaninar extends Planinar {
//Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. 
//Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon 
//postavljanja u konstuktoru: 
//težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
//naziv okruga odakle je rekreativni planinar. 
//maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov 
//najveći uspon manji od visine planine, s tim da oprema dodatno otežava 
//penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje. 
//rekeativci placaju clanarinu u iznosu od 1000 rsd
//metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
//Rekreativac, id: (id) ime: (ime i prezime) Okrug: (okrug) 

	private int tezinaOpreme;
	private String okrug;
	private double maksUspon;

	public RekreativniPlaninar(int id, String imeIPrezime, int tezinaOpreme, String okrug, double maksUspon) {
		super(id, imeIPrezime);
		this.tezinaOpreme = tezinaOpreme;
		this.okrug = okrug;
		this.maksUspon = maksUspon;
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public void setTezinaOpreme(int tezinaOpreme) {
		this.tezinaOpreme = tezinaOpreme;
	}

	public String getOkrug() {
		return okrug;
	}

	public void setOkrug(String okrug) {
		this.okrug = okrug;
	}

	public double getMaksUspon() {
		return maksUspon;
	}

	public void setMaksUspon(double maksUspon) {
		this.maksUspon = maksUspon;
	}

	@Override
	public void stampa() {
		System.out.println("Rekreativac, Id: " + this.id);
		System.out.println("Ime: " + this.imeIPrezime);
		System.out.println("Okrug: " + this.okrug);
	}

	@Override
	public int clanarina() {
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina p) {
		if (p.getVisinaPlanine() > this.maksUspon - (this.tezinaOpreme * 50)) {
			return false;
		}
		return true;
	}
}