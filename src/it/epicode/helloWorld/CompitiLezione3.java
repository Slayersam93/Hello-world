package it.epicode.helloWorld;
import java.util.Scanner;   

import java.util.Arrays;

public class CompitiLezione3 {

	public static void main(String[] args) {
		//int n = 4;
		Scanner console = new Scanner(System.in);
		System.out.println("Dammi un numero Porca Madonna");
		int n = console.nextInt();
		System.out.println("Il fattoriale del tuo numero e' "+fattoriale(n));
		System.out.println("Dammi un numero coglione");
		int valore = console.nextInt();
		int [] fibb = fibbonacciString(valore);
		System.out.println("Il valori fibbonacci fino al numero dato sono "+ Arrays.toString(fibb));
		System.out.println("Dammi un numero merda");
		int x = console.nextInt();
		fizzBuzz(x);
		//System.out.println(zzif);
		console.close();
	}
	public static int fattoriale (int a) {
		int t=1;
		for (int i=1; i<=a; i++) {
			t= t*i;
		}
		return t;
	}
	
	public static int[]  fibbonacciString(int numero ) {
		int[] serie = new int [numero];
		serie[0] = 1;
		serie[1] = 1;
		for (int i = 2; i<(numero); i++) {
			serie[i] = serie [i-1] + serie [i-2];
		}
		
		return serie;
	}
	public static void fizzBuzz(int x) {
		//String fizzBuzz= "Ecco i numeri fino a: ";
		if (x<=0) {
			//return fizzBuzz = "Non va bene questo numero stronzo";
			System.out.println("Non va bene questo numero stronzo");
		}
		//int y=0; 
		for(int i = 0; i<=x; i++ ) {
			//y= y+1;
			//fizzBuzz = fizzBuzz + y +" ";
			if (i % 3 == 0 && i % 5== 0) {
				System.out.println("fizzbuzz");
			}
			else if (i % 3==0) {
				System.out.println("fizz");
			}
			else if (i % 5==0) {
				System.out.println("buzz");
			}
			else {
			System.out.println(i);
			}
			
		}
		//return fizzBuzz;
	}
}