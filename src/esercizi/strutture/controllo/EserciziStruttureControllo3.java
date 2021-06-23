package esercizi.strutture.controllo;

import java.util.Scanner;

public class EserciziStruttureControllo3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un carattere per iniziare");
		String parola = scanner.nextLine();
		String fine = ":q";
		while (!parola.equals(fine)) {
			System.out.println("Scrivi una parola che te la faccio a pezzettini: ");
			String stringa = scanner.nextLine();
			spezzaParole(stringa);
			System.out.println("Scrivi una :q per uscire dal programma");
			parola = scanner.nextLine();
		}
		scanner.close();
}
	public static void spezzaParole(String string) {
		for (int i=0 ; i<string.length(); i++) {
			System.out.println(string.charAt(i)+",");
		}
	
	}
	
}