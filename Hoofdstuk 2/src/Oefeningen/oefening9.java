package Oefeningen;

import java.util.Scanner;

public class oefening9 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int getal = 0,wijzigingen = 0;
		while (getal <1)
		{
			System.out.print("Geef een strikt positief geheel getal in: ");
			getal = input.nextInt();
		}
		while(getal != 1) {
			if(getal % 2 == 0) {
				getal = getal/2;
			}
			else {
				getal = (getal*3)+1;
			}
			wijzigingen++;
		}
		if (wijzigingen == 1)
		{
			System.out.printf("Het getal wijzigt %d keer", wijzigingen);	
		}
		else {
			System.out.printf("Het getal wijzigt %d keren", wijzigingen);
		}
		input.close();
	}
}
