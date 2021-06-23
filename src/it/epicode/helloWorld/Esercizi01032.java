package it.epicode.helloWorld;
import java.util.Scanner;

public class Esercizi01032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console= new Scanner(System.in);
//		System.out.println("Scrivi una frase");
//		String primaFrase= console.nextLine();
//		 dentro primaFrase finisce l'indirizzo della stringa che e stata creata a partire da cio che l'utente ha scritto nella tastiera
//		System.out.println("Scrivi una frase");
//		String secondaFrase= console.nextLine();
//		System.out.println("Scrivi una frase");
//		String terzaFrase= console.nextLine();
//		System.out.println(terzaFrase +" "+secondaFrase +" "+primaFrase);
		String [] frasi= new String[3];
		for (int i=0; i<frasi.length; i++) {
			System.out.println("Scrivi una frase");
			frasi[i]= console.nextLine();
			}
		for (int i= frasi.length-1; i>=0; i--) {
			System.out.print(frasi[i]);
			if(i!=0)
				System.out.print(" ");
		
		}
		console.close();
		
	}
	public static double calcolaPerimetroRettangolo(double h , double l) {
		double perimetro= 2*(h+l);
		return perimetro; 
	}
	public static boolean isEven(int x) {
		if (x % 2 == 0) {
			return true;
		}
//		else {
//			return false;
//		}
		return false;
		
	}
	
	


}
        