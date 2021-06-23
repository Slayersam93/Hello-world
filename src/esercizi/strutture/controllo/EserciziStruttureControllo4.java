package esercizi.strutture.controllo;

import java.util.Scanner;

public class EserciziStruttureControllo4 {

	public static void main(String[] args) {
		System.out.println("Inserisci un numero: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		//int[] timeLapse=new int[numero];
		for (int i=numero; i>=0;i--) {
			System.out.println(i);
		}
		scanner.close();
		}
	}

