package BtwNummer;

import java.util.Scanner;


public class Applicatie {
	public static void main(String[] args)
	{
		Applicatie object = new Applicatie();
		Scanner input = new Scanner(System.in);
		System.out.print("Geef een btw-nummer van de vorm ABC.PQR.XYZ zonder de puntjes: ");
		int nummer = input.nextInt();
		if(object.isGeldig(nummer))
		{
			System.out.printf("%s is een geldig btw-nummer",nummer);
		}
		else {
			System.out.printf("%s is een ongeldig btw-nummer",nummer);
		}
	}
	private boolean isGeldig(int nummer)
	{
		int rest = Integer.valueOf(String.valueOf(nummer).substring(0, 7)) % 97;
		if (rest + Integer.valueOf(String.valueOf(nummer).substring(7)) == 97)
		{
			return true;
		}
		else {
			return false;
		}
	}
}
