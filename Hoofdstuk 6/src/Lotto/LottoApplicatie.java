package Lotto;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;


public class LottoApplicatie {
	public static void main(String[] args) {
		int[] getallen = new int[6];
		int[][] statistieken = new int[45][2];
		int[] aantalJuist = new int[7];
 		LottoApplicatie object = new LottoApplicatie();
		object.leesGetallen(getallen);
		Arrays.sort(getallen);
		System.out.printf("Gekozen getallen: %s%n%n", Arrays.toString(getallen));
		System.out.printf("Trekkingen: %n%n");
		
		for (int x = 1; x <= 1000;x++)
		{
			int[] trekkingsGetallen = new int[6];
			object.kiesWillekeurigeGetallen(trekkingsGetallen);
			System.out.printf("Trekking %d - Getrokken getallen: %s - Aantal juiste: %d%n", x,Arrays.toString(trekkingsGetallen),object.controleer(getallen, trekkingsGetallen));
			for(int i : trekkingsGetallen)
			{
				statistieken[i-1][1]++;
			}
			aantalJuist[object.controleer(getallen, trekkingsGetallen)]++;
		}
		System.out.println(object.geefOverzichtGewonnen(aantalJuist));
		System.out.print(object.geefStatistieken(statistieken));
	}

	private void leesGetallen(int[] getallen) {
		Scanner input = new Scanner(System.in);
		for(int x = 0; x < 6 ; x++)
		{
			int getal = 0;
			do
			{
			System.out.printf("Kies je %de lottogetal (1-45): ",x +1);
			getal = input.nextInt();	
			if(komtVoor(getal,getallen))
			{
				getal = 0;
			}
			}while(getal < 1 || getal > 45);
			getallen[x] = getal;	
		}
		input.close();
	}

	private void kiesWillekeurigeGetallen(int[] getallen) {
		SecureRandom rnd = new SecureRandom();
		for(int x = 0; x < 6 ; x++)
		{
			int getal = 0;
			do
			{
			getal = rnd.nextInt(45)+1;	
			if(komtVoor(getal,getallen))
			{
				getal = 0;
			}
			}while(getal < 1 || getal > 45);
			getallen[x] = getal;	
		}
	}

	private boolean komtVoor(int element, int[] array) {
		for (int a : array)
		{
			if (a == element)
			{
				return true;
			}
		}
		return false;
	}

	private int controleer(int[] gekozen, int[] getrokken) {
		int aantalZelfde = 0;
		for (int x = 0; x < 6; x++)
		{
			for (int i = 0; i < 6; i++)
			{
				if (gekozen[x] == getrokken[i])
				{
					aantalZelfde++;
				}
			}
		}
		return aantalZelfde;
	}

	private String geefOverzichtGewonnen(int[] nrsJuist) {
		String overzicht = "\nAantal keer x nummers juist:\n\n";
		for(int i = 0;i < nrsJuist.length;i++)
		{
			overzicht = overzicht + nrsJuist[i] + " keer " + i + " nummers juist\n";
		}
		return overzicht;
	}

	private String geefStatistieken(int[][] trekkingen) {
		String overzicht = "\nStatistieken per bal:\n\n";
		for(int x = 1; x <= trekkingen.length;x++)
		{
			overzicht = overzicht + "Bal " + x + " werd " + trekkingen[x-1][1] + " keer getrokken\n";
		}
		return overzicht;
	}
}
