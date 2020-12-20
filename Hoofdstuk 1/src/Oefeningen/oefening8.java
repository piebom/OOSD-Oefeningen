package Oefeningen;

import java.util.Scanner;

public class oefening8 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String datum,dagen,maanden;
		System.out.print("Geef een datum in <ddmmjjjj>:");
		datum = input.next();
		maanden = datum.substring(datum.length()-6,datum.length() - 4);
		dagen = datum.substring(0,datum.length()-6);
		System.out.printf("Het duurt nog %d dagen voor het terug nieuwjaar is!", ((13-Integer.valueOf(maanden))*30-Integer.valueOf(dagen)));
		input.close();
	}
}
