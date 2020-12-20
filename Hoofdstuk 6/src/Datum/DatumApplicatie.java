package Datum;

import java.util.Scanner;

import DatumDomein.Dagjaar;
import DatumDomein.DatumControle;

public class DatumApplicatie {

	public static void main(String[] args) {
		DatumControle dc = new DatumControle();
		Dagjaar dj = null;
		Scanner input = new Scanner(System.in);
		boolean geldig = false;
		while (geldig == false)
		{
			System.out.print("Geef dag in: ");
			int dag = input.nextInt();
			System.out.print("Geef maand in: ");
			String maand = input.next();
			try
			{
				int maandInt = Integer.valueOf(maand);
				if (maand.length() <2)
				{
					maand = "0" + maand;
				}
				System.out.printf("De datum %d %d is %s%n%n", dag,maandInt,dc.controleerDatumDDMM(Integer.valueOf(String.valueOf(dag) + maand)) == true ? "geldig" : "ongeldig");
				if (dc.controleerDatumDDMM(Integer.valueOf(String.valueOf(dag) + maand)) == true)
				{
					dj = new Dagjaar(dag,maandInt);
					geldig =true;
				}
			}catch(Exception e)
			{
				System.out.printf("De datum %d %s is %s%n%n", dag,String.valueOf(maand),dc.controleerDatumDDMM(dag,maand) == true ? "geldig" : "ongeldig");	
				if (dc.controleerDatumDDMM(dag,maand) == true)
				{
					dj = new Dagjaar(dag,maand);
					geldig =true;
				}
			}
		}
		System.out.printf("De datum in dagen: %d%n",dj.getDagen());
		System.out.print("Hoeveel dagen wens je toe te voegen? " );
		int dagen = input.nextInt();
		dj.addDagen(dagen);
		System.out.printf("De datum in dagen NA de toevoeging = %d",dj.getDagen());
	}

}
