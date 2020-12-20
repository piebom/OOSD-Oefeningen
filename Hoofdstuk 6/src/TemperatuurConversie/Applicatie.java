package TemperatuurConversie;

import java.util.Scanner;

public class Applicatie {
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Applicatie object = new Applicatie();
		float temperatuur = 0;
		int keuze = 0;
		while (keuze != 3)
		{
			keuze = object.kiesUitMenu();
			temperatuur = object.leesTemp();
			switch(keuze) {
			case 1:
				System.out.printf("%.1f in Celsius komt overeen met %.1f in Fahrenheit%n", temperatuur,object.calcFahren(temperatuur));
				break;
			case 2:
				System.out.printf("%.1f in Fahrenheit komt overeen met %.1f in Celsius%n", temperatuur,object.calcCalsius(temperatuur));
			}
		}
	}
	private float leesTemp() {
		System.out.print("Geef een temperatuur: ");
		return input.nextFloat();
	}
	private float calcFahren(float celsius)
	{
		return (32 +(celsius *9) /5);
	}
	private float calcCalsius(float fahren)
	{
		return (float) ((fahren -32)/1.8);
	}
	private int kiesUitMenu() {
		Scanner input = new Scanner(System.in);
		int getal = 0;
			System.out.println("Menu");
			System.out.println("1) Omzetten naar Fahrenheit");
			System.out.println("2) Omzetten naar Celcius");
			System.out.println("3) Stoppen");		
			while (getal != 3)
			{
				System.out.print("Wat kies je? ");
			switch(input.nextInt())
			{
			case 1:
				return 1;
			case 2:
				return 2;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Ongeldige keuze");
				break;
			}
		}
		return getal;
	}
}
