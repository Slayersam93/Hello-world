package esercizio.banca;

import java.time.LocalDate;

public class Cliente {
	public String nome;
	public String cognome;
	public String codiceFiscale;
	public String numeroDiTelefono;
	public LocalDate dataDiNascita;
	public ContoCorrente [] conti = new ContoCorrente[3];
	public boolean aggiungiConto(ContoCorrente c){
		for(int i=0; i<conti.length; i++ ) {
			if (conti[i]== null) {
				conti[i]=c;
				return true;
			}
		}
		return false;
	}
	public ContoCorrente rimuoviConto(int pos) {
		ContoCorrente rimosso= conti[pos];
		conti[pos] = null;
		return rimosso;
	}
	public double calcolaSaldoTotale() {
		double saldoTotale=0;
		for (int i=0; i< conti.length; i++) {
			if (conti[i] != null) {
				saldoTotale= saldoTotale+conti[i].saldo;
			}
		}
		return saldoTotale;
	}
	public void saluta () {
		System.out.println("Buongiorno sono "+nome +" "+cognome);
	}
	public boolean isMillennial() {
		return dataDiNascita.getYear()>=2000;
//		if (dataNascitaDate.getYear()>=2000) {
//			return true;	
//		}
//		return false;
	}
//	public Cliente() {
//		
//	}
	public Cliente (String nome, String cognome, String codiceFiscale,String numeroDiTelefono, LocalDate dataDiNascita,ContoCorrente c ) {
		this.nome= nome;
		this.cognome= cognome;
		this.codiceFiscale= codiceFiscale;
		this.numeroDiTelefono= numeroDiTelefono;
		this.dataDiNascita= dataDiNascita;
		this.conti[0]=c;
	}
	public Cliente (String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
}
