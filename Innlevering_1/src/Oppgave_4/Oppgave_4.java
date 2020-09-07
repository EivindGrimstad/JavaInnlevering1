package Oppgave_4;
import java.util.*;
public class Oppgave_4 {

	public static void main(String[] args) {
		
		//Opprette et sted en kan skrive inn en verdi
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter your income(must be a positive digit):  ");  
		int value= scanner.nextInt();  
		double percent= 0;
		double tax= 0;
		
		// Programmet velger prosent basert på inntastet verdi
		if (value<=0 & value>=180800) {
			System.out.println("Ingen trinnskatt");		
		}		
		else if (value<=180800 & value>=254500) {
			System.out.println("Trinnskatt 1");
			percent = 0.019;
		}
		else if (value<=254500 & value>=639750) {
			System.out.println("Trinnskatt 2");
			percent = 0.042;
		}	
		else if (value<=639750 & value>=999550) {
			System.out.println("Trinnskatt 3");
			percent = 0.13;
		}		
		else { // Kun verdier over 0 så dette rester alle verdier over 999550:)
			System.out.println("Trinnskatt 4");
			percent = 0.162;
		}		 	
		tax=value*percent;
		System.out.println( tax + " kr, så mye penger tok staten fra deg");		
	}
}
