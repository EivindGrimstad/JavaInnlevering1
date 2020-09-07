package Oppgave_5;

import java.util.Scanner;

public class Oppgave_5 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Elev nummer " + (i+1));
			Scanner scanner= new Scanner(System.in);
			System.out.print("Skriv inn poengsummen din:  ");  
			int value= scanner.nextInt();
			double karakter;
			
			if (value<=100 & value>=90) {
				System.out.println("Karakter A");				
			}
			
			else if (value<=89 & value>=80) {
				System.out.println("Karakter B");
			}
			
			else if (value<=79 & value>=60) {
				System.out.println("Karakter C");				
			}
			
			else if (value<=59 & value>=50) {
				System.out.println("Karakter D");				
			}
			
			else if (value<=49 & value>=40) {
					System.out.println("Karakter E");
			}
			
			else if (value<=39 & value>=0) {
				System.out.println("Karakter f");
			}
			
			else { 
				i--;
				System.out.println("Feil, skriv inn en verdi mellom 0-100");
			}		
		}
	}
}
			
