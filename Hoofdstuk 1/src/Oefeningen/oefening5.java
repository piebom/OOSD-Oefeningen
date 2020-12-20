package Oefeningen;

import java.util.Scanner;

public class oefening5 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int lengte, breedte;
		
		System.out.println("Geef de lengte van de rechthoek in: ");
		lengte = input.nextInt();
		System.out.println("Geef de breedte van de rechthoek in: ");
		breedte = input.nextInt();
		
		System.out.printf("De omtrek = %d%n",(2*lengte + 2*breedte));
		System.out.printf("De oppervlakte = %d%n",(lengte*breedte));
		
		input.close();
		
	}
}
