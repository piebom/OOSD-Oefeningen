package Oefeningen;

import java.util.Scanner;

public class oefening6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int getal = 0;
		while (getal < 999 | getal > 9999)
		{
			System.out.println("Geef een getal (>=999 en <=9999) in: ");
			getal = input.nextInt();
			if (getal < 999 | getal > 9999)
			{
				System.out.println("Het opgeheven getal ligt niet tussen 999 en 9999");
			}
		}
		
		
		System.out.println("Het getal bestaat uit:");
		System.out.printf("%d duizendtallen", getal/1000);
		System.out.printf("%n%d honderdtallen", (getal/100)%10);
		System.out.printf("%n%d tientallen", (getal/10)%10);
		System.out.printf("%n%d eenheden", getal%10);
	
		input.close();
	}
}
