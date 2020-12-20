package Oefeningen;

import java.util.Scanner;

public class oefening2 {
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		int getal;
		
		System.out.print("Geef een getal in: ");
		getal = input.nextInt();
		
		if(getal>0) {
			getal = getal - 10;
			System.out.printf("Het ingegeven getal was strikt positief en werd verminderd met 10.\nHet heeft nu de waarde %d",getal);
			}
		else if(getal <0) {
			getal = getal + 10;
			System.out.printf("Het ingegeven getal was strikt negatief en werd vermeerderd met 10.\nHet heeft nu de waarde %d",getal);
			}
		else {
			getal = getal + 1;
			System.out.print("Het ingegeven getal was nul en werd vermeerderd met 1.");
			}
		input.close();
	}
}
