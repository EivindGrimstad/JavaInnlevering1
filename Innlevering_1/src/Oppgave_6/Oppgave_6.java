package Oppgave_6;

import java.util.Scanner;

public class Oppgave_6 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Skriv inn ønsket fakultet n:  ");  
		int value= scanner.nextInt();  
		int sum = value;
		for (int i = value-1; i>1; i-- ) { 
			sum=sum*i;
		}
	System.out.print("n!= "  + sum);
	}

}
