package Oefeningen;

import java.util.Scanner;

public class oefening7 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		int getal = -1, Deelbaar2=0, Deelbaar3=0, Deelbaar6=0;
		while(getal != 0)
		{
			System.out.print("Geef een positief geheel getal (stoppen met 0): ");
			getal = input.nextInt();
			if (getal != 0)
			{
				if (getal%2==0)
				{
					Deelbaar2++;
				}
				if (getal%3==0)
				{
					Deelbaar3++;
				}
				if (getal%6==0)
				{
					Deelbaar6++;
				}	
			}
		}
		System.out.printf("Er zijn %d getallen deelbaar door 2%n",Deelbaar2);
		System.out.printf("Er zijn %d getallen deelbaar door 3%n",Deelbaar3);
		System.out.printf("Er zijn %d getallen deelbaar door 6",Deelbaar6);
		input.close();
	}
}
