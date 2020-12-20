package Oefeningen;

//import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

public class oefening5 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		/*
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++)
		{
			System.out.printf("Geef getal %d in: ", i);
			int getal = input.nextInt();
			list.add(getal);
		}
		Collections.sort(list);
		
		System.out.printf("%nHet op één na grootste getal is %d",list.get(8));
		*/
		
		int getal1=0, getal2=0;
		
		for (int i = 1; i < 11; i++)
		{
			System.out.printf("Geef getal %d in: ", i);
			int getal = input.nextInt();
			if(getal > getal2) {
				getal1 = getal2;
				getal2 = getal;
				continue;
			}
			if (getal > getal1) {
				getal1=getal;
			}
		}
		System.out.printf("%nHet op één na grootste getal is %d",getal1);
		input.close();
	}
}
