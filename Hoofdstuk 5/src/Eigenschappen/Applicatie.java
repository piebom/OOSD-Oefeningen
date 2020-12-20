package Eigenschappen;

import java.util.ArrayList;
import java.util.Scanner;

public class Applicatie {
	public static void main (String[] args)
	{
		ArrayList<String> positief = new ArrayList<String>();
		ArrayList<String> negatief = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		while(positief.size() + negatief.size() < 3)
		{
			System.out.println("Is het een positieve (=1) of een negatieve (=2) eigenschap?");
			switch(input.nextInt())
			{
			case 1:
				System.out.println("Omschrijf deze eigenschap");
				positief.add(input.next());
				break;
			case 2:
				System.out.println("Omschrijf deze eigenschap");
				negatief.add(input.next());
				break;
			}
		}
		switch (positief.size())
		{
		case 0:
			System.out.println("Geen positieve eigenschappen");
			System.out.printf("Negatieve eigenschappen: %s",negatief.toString().replace("[", "").replace("]", ""));
			break;
		case 1:
			System.out.printf("Positieve eigenschappen: %s%n",positief.toString().replace("[", "").replace("]", ""));
			System.out.printf("Negatieve eigenschappen: %s",negatief.toString().replace("[", "").replace("]", ""));
			break;
		case 2:
			System.out.printf("Positieve eigenschappen: %s%n",positief.toString().replace("[", "").replace("]", ""));
			System.out.printf("Negatieve eigenschappen: %s",negatief.toString().replace("[", "").replace("]", ""));
			break;
		case 3:
			System.out.printf("Positieve eigenschappen: %s%n",positief.toString().replace("[", "").replace("]", ""));
			System.out.println("Geen negatieve eigenschappen");
			break;
		}
	}
	
}
