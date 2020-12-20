package Oefeningen;

import java.util.Scanner;

public class oefening8 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int deler=0,getal=0,counter = 1, aantaldeelbaar = 0;
		while (deler <1)
		{
			System.out.print("Geef een strikt positieve deler in: ");
			deler = input.nextInt();
		}
		while(getal != -1)
		{
			System.out.printf("Geef positief getal %d in (of stop met -1): ",counter);
			getal = input.nextInt();
			counter++;
			if(getal%deler  == 0)
			{
				aantaldeelbaar++;
			}
		}
		if (aantaldeelbaar == 1)
		{
			System.out.printf("%nEr is %d getal deelbaar door %d", aantaldeelbaar, deler);	
		}
		else {
			System.out.printf("%nEr zijn %d getallen deelbaar door %d", aantaldeelbaar, deler);
		}
		
		input.close();
	}
}
