package esercizi.strutture.controllo;
import java.util.Scanner;
public class EserciziStruttureControllo {

	public static void main(String[] args) {
		System.out.println("Dammi una stringa");
		Scanner console = new Scanner(System.in);
		String pD = console.nextLine();
		System.out.println("La stringa " + pD + " è pari? " + stringaPariDispari(pD));
	
		System.out.println("Dammi una anno");
		int anno = console.nextInt();
		System.out.println("L'anno " + anno + " è bisestile? " + annoBisestile(anno));
		console.close();
	}
	public static boolean stringaPariDispari(String string) {
		if (string.length()%2==0){
			return true;
		}
			return false;
		}
	public static boolean annoBisestile(int anno) {
		if (anno % 4==0 && anno% 100== 0 && anno% 400==0) {
			return true;
		}else if (anno % 4 ==0 && anno %100 != 0) {
			return true;
		}
		return false;
	}
	}

