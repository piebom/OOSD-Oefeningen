package Arraybewerkingen;

import java.security.SecureRandom;
import java.util.Scanner;

import ArraybewerkingenDomein.ArrayBewerking;

public class ArrayBewerkingApp {

	public static void main(String[] args) {
		SecureRandom rnd = new SecureRandom();
		int[] rij1 = {2,7,1,9,4};
		int[] rij2 = new int[5];
		invoerRij(rij2);
		double[] rij3 = ArrayBewerking.deel(rij1, rij2);
		
		System.out.print("Rij1 = " + ArrayBewerking.toon(rij1) + "\n");
		System.out.print("Rij2 = " + ArrayBewerking.toon(rij2) + "\n");
		System.out.print("Rij3 = " + ArrayBewerking.toon(rij3)+ "\n\n");
		
		int randomGetal = rnd.nextInt((rij3.length - 1) + 1);
		ArrayBewerking.schuifOp(rij3, randomGetal);
		System.out.printf("Rij3 na verschuiving met %d = " + ArrayBewerking.toon(rij3)+ "\n\n",randomGetal);
	}

	public static void invoerRij(int[] rij) {
		Scanner input = new Scanner(System.in);
		for (int x = 0; x < 5;x++)
		{
			boolean correct = true;
			System.out.printf("Geef strikt positief getal nr %d in: ",x+1);
			while(correct)
			{
				int getal = input.nextInt();
				if (getal > 0)
				{
					correct = false;
					rij[x] = getal;
				}
				else {
					System.out.printf("Geef strikt positief getal nr %d in: ",x+1);
				}
			}	
		}
		input.close();
	}
}
