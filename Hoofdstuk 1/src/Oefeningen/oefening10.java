package Oefeningen;

import java.util.Scanner;

public class oefening10 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int getal1,getal2,getal3;
		
		System.out.print("Geef eerste getal in: ");
		getal1 = input.nextInt();
		System.out.print("Geef tweede getal in: ");
		getal2 = input.nextInt();
		System.out.print("Geef derde getal in: ");
		getal3 = input.nextInt();
		System.out.println("Van de ingevoerde getallen " + getal1 + ", " + getal2 + " en " + getal3);
		
		int som, gemiddelde;
		som = getal1 + getal2 +getal3;
		gemiddelde = som / 3;
		System.out.printf("is de som %d%n", som);
		System.out.printf("het gemiddelde %d%n", gemiddelde);
		System.out.printf("en de rest %d", som - (gemiddelde*3));
		input.close();
	}
}
