package Oefeningen;

import java.util.Scanner;

public class oefening6 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int getal;
		String output = "De delers zijn: ";
		System.out.print("Geef een strikt positief geheel getal in: ");
		getal = input.nextInt();
		if(getal > 1)
		{
		for(int i = 1;i <= getal-1; i++) {
			if (getal %i ==0)
			{
				output += String.valueOf(i) + " ";
			}
		}
		output += "en " + getal;
		}
		else {
			output += "1";
		}
		System.out.print(output);
		input.close();
	}
}
