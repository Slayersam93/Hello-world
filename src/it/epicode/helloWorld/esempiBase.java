package it.epicode.helloWorld;

public class esempiBase {
	
	public static void main(String[]args) {
		int[] numbers = {1,2,3,4,5};
		int s = sommaArray(numbers);
		System.out.println(s);
	}
	
	public static int somma(int x, int y) {
		//int somma=x+y;
		//return somma;
		return x + y;
	}

	public static int sommaArray(int[]array) {
		int lenght = array.length;
		int somma= 0;
		for(int i=0; i<lenght; i++) {
			somma = somma + array[i];
		}		
		return somma;
	}
}
