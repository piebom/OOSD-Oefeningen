package Oefeningen;

import java.util.Scanner;

public class oefening3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String postnummer = "",stad = "";
		
		while(postnummer.length() == 0 || postnummer.length() > 4 || postnummer == "") {
			System.out.print("Geef een postcode (4 cijfers): ");
			postnummer = input.next();	
		}
		switch(postnummer) {
		case "9300":
			stad = "Aalst";
			break;
		case "2000":
			stad = "Antwerpen";
			break;
		case "1000":
			stad = "Brussel";
			break;
		case "9200":
			stad = "Dendermonde";
			break;
		case "9000":
			stad = "Gent";
			break;
		case "8500":
			stad = "Kortijk";
			break;
		case "9700":
			stad = "Oudenaarde";
			break;
		case "2300":
			stad = "Turnhout";
			break;
		}
		if(stad == "") {
			System.out.printf("Postnummer %s bestaat niet of komt overeen met een stad die niet in de tabel is opgenomen", postnummer);	
		}
		else {
			System.out.printf("Postnummer %s komt overeen met de stad %s", postnummer, stad);
		}
		
			input.close();
		
	}
}	
