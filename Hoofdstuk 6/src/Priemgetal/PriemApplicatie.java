package Priemgetal;

import java.security.SecureRandom;
import java.util.Scanner;

public class PriemApplicatie {

	public static void main(String[] args) {
		PriemApplicatie object = new PriemApplicatie();
		object.drukRes(object.isPriem(object.geefRandomGetal(object.leesInteger())));
	}

	private boolean isPriem(int getal) {
		for (int x = 2; x < getal; x++)
		{
			if(getal %x == 0)
			{
				return false;
			}
		}
		return true;
	}

	private int leesInteger() {
		Scanner input = new Scanner(System.in);
		int getal = -1;
		while(getal < 0)
		{
			System.out.print("Geef een strikt positief geheel getal: ");
			getal = input.nextInt();
		}
		return getal;
	}

	private void drukRes(boolean janee) {
		System.out.printf("Dit getal is %s priemgetal", janee == true ? "een" : "geen");
	}

	private int geefRandomGetal(int n) {
		SecureRandom s = new SecureRandom();
		int RandomGetal = s.nextInt(n);
		System.out.printf("Het random bepaalde getal tussen 0 en %d is %d%n",n,RandomGetal);
		return RandomGetal;
	}
}
