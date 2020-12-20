package Oefeningen;

import java.util.Scanner;

public class oefening7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hoogte, breedte,aantalRollen;
		
		System.out.println("Geef de hoogte van de muur in cm in: ");
		hoogte = input.nextInt();
		System.out.println("Geef de breedte van de muur in cm in: ");
		breedte = input.nextInt();
		
		aantalRollen = (int)Math.ceil(((double)hoogte*breedte)/50000);
		System.out.printf("Het aantal benodigde rollen = %d", aantalRollen);
		input.close();
	}
}
