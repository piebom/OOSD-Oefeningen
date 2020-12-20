package Oefeningen;

import java.util.Scanner;

public class oefening4 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int getal = 0,kilometers = 40;
		
		while(getal < 1)
		{
			System.out.print("Geef een afstand in kilometer (strikt positief geheel getal): ");
			getal = input.nextInt();
		}
		for(int i = 0; i <11;i++) {
			double tijd = ((double)getal/(double)kilometers)*(double)60;
			int hour = (int) (tijd /60);
			int minutes = (int) (tijd%60);
			System.out.printf(" %d km%10d km/u%10d u %d min%n",getal,kilometers,hour,minutes);
			kilometers = kilometers + 10;
		}
		input.close();
	}
}
