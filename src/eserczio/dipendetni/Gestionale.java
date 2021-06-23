package eserczio.dipendetni;

public class Gestionale {

	public static void main(String[] args) {
		Dipendete girolamo = new Dipendete("Pastorello zozzo merda", Dipartimento.PRODUZIONE );
		Dipendete fernandello = new Dipendete("Diversamete scenziato", Dipartimento.PRODUZIONE);
		Dipendete mariottide = new Dipendete("Papino perche' piangi", 1200, 30, Livello.IMPIEGATO,Dipartimento.AMMINISTRAZIONE);
		Dipendete padreMaronno = new Dipendete("Il libbro", 2000, 30 ,Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		girolamo.promuoviDipendente();
		System.out.println("-----------------------------------");
		mariottide.promuoviDipendente();
		System.out.println("-----------------------------------");
		girolamo.stampaDatiDipendente();
		System.out.println("-----------------------------------");
		fernandello.stampaDatiDipendente();
		System.out.println("-----------------------------------");
		mariottide.stampaDatiDipendente();
		System.out.println("-----------------------------------");
		padreMaronno.stampaDatiDipendente();
		System.out.println("-----------------------------------");
		
		double pagaGirolamo = girolamo.CalcolaStipendio(girolamo, 5);
		double pagaFernandello =fernandello.CalcolaStipendio(fernandello, 5);
		double pagaMariottide =mariottide.CalcolaStipendio(mariottide, 5);
		double pagaPadreMaronno =padreMaronno.CalcolaStipendio(padreMaronno, 5);
		double totalePaghe = pagaGirolamo + pagaFernandello + pagaMariottide + pagaPadreMaronno;
		
		System.out.println("Il totale degli stipendi da pagare e': "+totalePaghe);	
	}
}
