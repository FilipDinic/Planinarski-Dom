
public class PlaninarskiDomMain {

	public static void main(String[] args) {
//U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti 
//nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3),
//i istestirati svaku od metoda. 

		PlaninarskiDom a = new PlaninarskiDom();
		a.setNazivDoma("Koliba");
		a.setGodinaOsnivanja(1975);

		Planina b = new Planina();
		b.setImePlanine("Kopaonik");
		b.setDrzava("Srbija");
		b.setVisinaPlanine(2017);

		Planina c = new Planina();
		c.setImePlanine("Zlatibor");
		c.setDrzava("Srbija");
		c.setVisinaPlanine(1010);

		RekreativniPlaninar d = new RekreativniPlaninar(123, "Snezana Dinic", 20, "Nisavski", 1000);

		RekreativniPlaninar e = new RekreativniPlaninar(234, "Vladica Dinic", 40, "Nisavski", 1400);

		RekreativniPlaninar f = new RekreativniPlaninar(345, "Jana Dinic", 60, "Nisavski", 1900);

		Alpinista g = new Alpinista(456, "Filip Dinic", 35);

		Alpinista h = new Alpinista(567, "Goran Radic", 20);

		Alpinista i = new Alpinista(678, "Ivan Arsic", 15);

		a.uclaniPlaninara(d);
		a.uclaniPlaninara(e);
		a.uclaniPlaninara(f);
		a.uclaniPlaninara(g);
		a.uclaniPlaninara(h);
		a.uclaniPlaninara(i);

		a.stampa();
		System.out.println("----------------------------------------");
		System.out.println("Uspesno popeli - Kopaonik: " + a.brojUspesnoPopelih(c));
		System.out.println("Uspesno popeli - Zlatibor: " + a.brojUspesnoPopelih(b));
		System.out.println("Ukupni mesecni prihod doma: " + a.mesecniPrihod());

		System.out.println("----------------------------------------");

		a.izbaciPlaninara(234);
		a.izbaciPlaninara(678);

		a.stampa();
		System.out.println("----------------------------------------");
		System.out.println("Uspesno popeli - Kopaonik: " + a.brojUspesnoPopelih(c));
		System.out.println("Uspesno popeli - Zlatibor: " + a.brojUspesnoPopelih(b));
		System.out.println("Ukupni mesecni prihod doma: " + a.mesecniPrihod());
	}
}
