package VierkantUI;

import java.util.Scanner;

import Vierkant.Vierkant;

public class VierkantApplicatie {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int xCoor = 0;
		int yCoor = 0;
		int lengte = 0;
		
		System.out.print("Geef de x-coordinaat van de linkerbovenhoek in: ");
		xCoor = input.nextInt();
		System.out.print("Geef de y-coordinaat van de linkerbovenhoek in: ");
		yCoor = input.nextInt();
		System.out.print("De zijden van het vierkant hebben ook een lengte. Geef deze lengte in: ");
		lengte = input.nextInt();
		
		Vierkant vk = new Vierkant(xCoor, yCoor, lengte);
		
		System.out.println(vk.toString());
		int keuze = 0;
		while(keuze != 4)
		{
			keuze = maakKeuzeInMenu();
			switch(keuze)
			{
			case 1:
				vk.krimp();
				System.out.println(vk.toString());
				break;
			case 2:
				vk.groei();
				System.out.println(vk.toString());
				break;
			case 3:
				System.out.print("Geef de x-coordinaat van de linkerbovenhoek in: ");
				xCoor = input.nextInt();
				System.out.print("Geef de y-coordinaat van de linkerbovenhoek in: ");
				yCoor = input.nextInt();
				vk = new Vierkant(xCoor, yCoor, vk.getZijde());
				System.out.println(vk.toString());
				break;
			}
		}
		System.exit(1);
	}
	

	private static int maakKeuzeInMenu() {
		System.out.println("Menu:");
		System.out.println("1) Krimpen van het bestaande vierkant");
		System.out.println("2) Groeien van het bestaande vierkant");
		System.out.println("3) Een nieuwe linkerbovenhoek definieren");
		System.out.println("4) Applicatie afsluiten");
		
		return input.nextInt();
	}
}
