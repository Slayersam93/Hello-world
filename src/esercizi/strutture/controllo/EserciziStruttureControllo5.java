package esercizi.strutture.controllo;
import java.util.*;

public class EserciziStruttureControllo5 {
	public static void main(String[] args) {
		int[] values = { 1, 7, 5, 6, 7, 2, 2, 4, 2, 5 };
		System.out.println(simpleFindMode(values));
	}
/*
	public static void funzioneConta(int[] Array) {
		for (int i = 0; i < Array.length; i++) {
			int m = Array[i];
			int count = 1;
			for (int j = i + 1; j < Array.length; j++) {
				if (Array[i] == Array[j]) {
					count = count + 1;
				}
			}
			System.out.println("Il numero " + m + " appare " + count + " volte");
			count = 1;
		}
	}

	public static int[][] funzioneConta2(int[] Array) {
		int[][] arrayRisultati = new int[Array.length][3];
		for (int i = 0; i < Array.length; i++) {
			int m = Array[i];
			int count = 0;
			for (int j = 0; j < Array.length; j++) {
				if (Array[i] == Array[j]) {
					count = count + 1;
				}
			}
//				System.out.println("Il numero " + m + " appare " + count +" volte");
			arrayRisultati[i][0] = m;
			arrayRisultati[i][1] = count;

		}
		return arrayRisultati;
	}

	// Function to sort by column
	public static void sortbyColumn(int arr[][], int col) {
		// Using built-in sort function Arrays.sort
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			// Compare values according to columns
			public int compare(final int[] entry1, final int[] entry2) {

				// To sort in descending order revert
				// the '>' Operator
				if (entry1[col] < entry2[col])
					return 1;
				else
					return -1;
			}
		}); // End of function call sort().
	}

	public static int findMode(int[] input) {
		ValueCounter[] vc = new ValueCounter[input.length];
		int distinct = 0;
		for (int i = 0; i < input.length; i++) {
			int pos = contains(vc, input[i]);
			if (pos == -1) {
				ValueCounter newElement = new ValueCounter(input[i], 1);
				vc[distinct] = newElement;
				distinct++;
			} else {
				vc[pos].counter++;
			}

		}
		int posMax = 0;
		int countMax = vc[0].counter;
		for (int i = 1; i < distinct; i++) {
			if (vc[i].counter > countMax) {
				posMax = i;
				countMax = vc[i].counter;
			}
		}
		return vc[posMax].value;
	}

	public static int contains(ValueCounter[] vc, int x) {
		for (int i = 0; i < vc.length; i++) {
			if (vc[i] == null) {
				return -1;

			}
			if (vc[i].value == x) {
				return i;
			}
		}
		return -1;
	}
*/
	public static int simpleFindMode(int[] input) {
		int countMax = 0;										//max numero di volte che ho visto un intero
		int posMode = 0;										//posizione della moda(valora che appare + volte)
		int modValue = input[0];								//valore della moda
		for (int i = 0; i < input.length - 1; i++) {			//ciclo su tutti gli elementi validi dell'array (valido = diverso da Integer minvalue)
			if (input[i] == Integer.MIN_VALUE) {
				continue;										//se il valore è Integer minvalue, passo al prossimo
			}
			int count = 1;										//inizializzo il contatore per il valore in posizione i
			for (int j = i + 1; j < input.length; j++) {		//ciclo su tutti i valori validi a destra di i (j = i+1)
				if (input[j] == Integer.MIN_VALUE) {			
					continue;									//se il valore è Integer minvalue passo al prossimo
				}
				if (input[i] == input[j]) {						//confronto il valore in posizione i con il valore in posizione j;
					input[j] = Integer.MIN_VALUE;				//se sono uguali assegno ad input[j] il valore invalido Integer min value
					count++;									//incremento il contatore che mi dice quante volte ho visto il valore dell'intero nella posizione i
				}
			}
			if (count >= countMax) {							//alla fine del ciclo for su j, confronto quante volte ho visto l'elemento in posizione i con il massimo attuale; se il valore è maggiore --->
				countMax = count;								//dico che il massimo valore di volte che ho visto un intero è il numero di volte che ho visto il valore dell'intero in posizione i
				posMode = i;									//setto la posizione della moda al valore i
				modValue = input[i];							//setto la moda al valore che c'è in posizione i
			}
//			input[i] = Integer.MIN_VALUE;
		}
		return modValue;										//alla fine dell'algoritmo, il valore della moda è contenuto nella variabile modValue
	}
}

