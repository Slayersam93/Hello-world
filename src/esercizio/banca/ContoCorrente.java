package esercizio.banca;


public class ContoCorrente {
	public double saldo;
	

	public ContoCorrente(double saldo) {
		this.saldo = saldo;
	}
	public double deposita(double versamento){
		saldo= saldo + versamento;
		return saldo;
	}
	public double ritira (double prelievo) {
		saldo= saldo-prelievo;
		return saldo;
	}
}
