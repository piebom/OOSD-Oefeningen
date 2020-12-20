package cui;

import java.util.Scanner;

import domein.DomainController;

public class GalgjeApplicatie {
	public static void main(String[] args)
	{
		DomainController dc = new DomainController();
		Scanner input = new Scanner(System.in);
		
		dc.startGalgje();
		
		System.out.printf("Aantal missers: %d%n", dc.GetAantalMissers());
		System.out.printf("woord: %s%n", dc.getGemaskeerdWoord());
		
		while(dc.IsEindeSpel() == false)
		{
			System.out.print("Kies een letter: ");
			dc.kiesLetter(input.next());	
			System.out.printf("Aantal missers: %d%n", dc.GetAantalMissers());
			System.out.printf("woord: %s%n", dc.getGemaskeerdWoord());
		}
		
		System.out.printf("Het woord was: %s%n",dc.getGeheimWoord());
		System.out.printf("Jouw score is: %d%n",dc.getScore());
		if(dc.GetAantalMissers() == 10)
		{
			System.out.print("Het woord is niet geraden");
		}
		else {
			System.out.print("Het woord is geraden");
		}
	}
}
