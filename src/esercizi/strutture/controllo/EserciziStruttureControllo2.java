package esercizi.strutture.controllo;

import java.util.Scanner;

public class EserciziStruttureControllo2 {

	public static void main(String[] args) {
		System.out.println("Inserisci un numero: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		
		switch(numero){
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Due");
				break;
			case 3:
				System.out.println("Tre");
				break;
			default:
			System.out.println("Numero non valido");
			break;
	}
	scanner.close();
}
}