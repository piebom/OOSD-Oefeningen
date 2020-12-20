package Oefeningen;

import java.util.Scanner;

public class testklasse_auto {
	private static auto a;
	static int aantalgrijze = 0;
	static int aantalgeregistreerde = 0;
	public static void main (String[] args) {
		Scanner input  = new Scanner(System.in);
		int getal;
		boolean registreren = true;
		while(registreren)
		{
			System.out.print("Registratie auto\n(1) Auto (alles standaard)\n(2) Auto met gekozen kleur\n\nWens je nog een auto te registreren?");
			getal = input.nextInt();
			
			switch(getal) {
			case 1:
				a = new auto();
				aantalgeregistreerde++;
				aantalgrijze++;
				break;
			case 2:
				System.out.print("Geef een kleur: ");
				String kleur = input.next();
				a = new auto(kleur);
				aantalgeregistreerde++;
				break;
			default:
				System.out.printf("Aantal geregistreerde auto's: %d%n",aantalgeregistreerde);
				System.out.printf("Aantal grijze auto's: %d",aantalgrijze);
				registreren = false;
				break;
			}	
		}
	}
}
