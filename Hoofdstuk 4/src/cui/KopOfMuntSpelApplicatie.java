package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domein.DomeinController;

public class KopOfMuntSpelApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		DomeinController dc = new DomeinController();

		int keuze = 0;

		do {
			System.out.printf("Welkom%nWens je op makkelijk (1) of normaal te spelen (2)? ");
			keuze = input.nextInt();
		} while (keuze != 1 && keuze != 2);

		dc.maakSpel(keuze);

		List<Character> pogingCode = new ArrayList<>();

		while (!dc.isEindeSpel(pogingCode)) {
			
			pogingCode.clear();

			System.out.print("Geef uw poging 1 per 1 in: %n");

			for (int i = 0; i <= (1 + keuze); i++) {
				pogingCode.add(input.next().charAt(0));
			}

			System.out.printf("%nUw huidige score is %d/%s%n", dc.geefScore(pogingCode), keuze == 1 ? "3" : "4");
		}

		String code = "";

		for (Character teken : dc.geefCode()) {
			code += teken;
		}

		System.out.printf("%nProficiat u heeft de code gekraakt%nCode: %s%nMoeilijkheidsgraad: %s", code,
				dc.geefMoeilijkheidsgraad() == 1 ? "Makkelijk" : "Normaal");

	}

}
