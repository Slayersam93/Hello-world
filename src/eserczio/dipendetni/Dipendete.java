package eserczio.dipendetni;

public class Dipendete {
	public static double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double straordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	public Dipendete(String matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendioBase;
		this.straordinario = 30;
		this.livello = Livello.OPERAIO;
		
		
	}
	public Dipendete (String matricola, double stipendio, double straordinario, Livello livello,Dipartimento dipartimento) {
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.straordinario = straordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	}
	public void stampaDatiDipendente  () {
		System.out.println("Matricola: "+matricola);
		System.out.println("Stipendio: "+ stipendio);
		System.out.println("Straordinario: "+straordinario );
		System.out.println("Livello: "+livello);
		System.out.println("Dipartimento: "+dipartimento);
	}
	
	public Livello promuoviDipendente() {
		if (livello ==Livello.OPERAIO) {
			this.livello=Livello.IMPIEGATO;
			this.stipendio =stipendioBase * 1.2;
		}else if (livello== Livello.IMPIEGATO) {
			this.livello = Livello.QUADRO;
			this.stipendio =stipendioBase * 1.5;
		}else if (livello == Livello.QUADRO) {
			this.livello= Livello.DIRIGENTE;
			this.stipendio =stipendioBase * 2;
		}else if (livello == Livello.DIRIGENTE) {
			System.out.println("Questo dipendente non puo' essere promosso");
		}
	System.out.println("Il dipendente e' stato promosso a "+ livello);
	return livello;
	}
	public double calcolaPaga(Dipendete dipendete) {
		return dipendete.getStipendio();
	}
	public double CalcolaStipendio (Dipendete dipendete, double oreStraordinari) {
		return dipendete.getStipendio() + (oreStraordinari*dipendete.straordinario);
	}
	public double getStipendioBase() {
		return stipendioBase;
	}
	public String getMatricola() {
		return matricola;
	}
	public double getStipendio() {
		return stipendio;
	}
	public double getStraordinario() {
		return straordinario;
	}
	public Livello getLivello() {
		return livello;
	}
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	public void setStraordinario(double straordinario) {
		this.straordinario = straordinario;
	}
	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	
}
