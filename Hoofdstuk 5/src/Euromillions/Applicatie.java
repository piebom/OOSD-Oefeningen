package Euromillions;

import java.security.SecureRandom;
import java.util.Arrays;

public class Applicatie {
	public static void main (String[] args)
	{
		int aantalGetallen = 5;
		int aantalSterren = 2;
		
		int[] getallen = new int[aantalGetallen];
		int[] sterren = new int[aantalSterren];
		String[] sterrenbeeld = {"Ram" , "Leeuw" , "Boogschutter", "Stier","Maagd" ,"Steenbok","Tweelingen","Weegschaal","Waterman","Kreeft","Schorpioen","Vissen"};
		
		SecureRandom rnd = new SecureRandom();
		
		for (int x = 0; x < aantalGetallen;x++)
		{
			getallen[x] = (rnd.nextInt(50) + 1);
		}
		for (int x = 0; x < aantalSterren;x++)
		{
			sterren[x] = (rnd.nextInt(12) + 1);
		}
		
		Arrays.sort(getallen);
		Arrays.sort(sterren);
		
		System.out.printf("De getallen zijn %s%n", Arrays.toString(getallen));
		System.out.printf("De sterren %s%n", Arrays.toString(sterren));
		System.out.printf("Het sterrenbeeld = %s", sterrenbeeld[rnd.nextInt(11)]);
	}
}
