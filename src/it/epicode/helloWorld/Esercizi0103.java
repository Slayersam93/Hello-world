/**
 * 
 */
package it.epicode.helloWorld;

public class Esercizi0103 {
	
	public static void main (String[] args) {
		int x1= 10;
		int x2= 20;
		int risultato= moltiplica (x1, x2);
		System.out.println(risultato);
		String nome1= "riccardo";
		String nome2= "pippo";
		String messaggio= saluta(nome1, nome2);
		System.out.println(messaggio);
	} 
	public static int moltiplica (int x1, int x2) {
		int prodotto= x1 * x2;
		return prodotto;
	}
	public static String saluta (String nome1, String nome2) {
		String saluto= "buongiorno " +nome1 + ", buongiono " +nome2; 
		return saluto;
	}
	
}

