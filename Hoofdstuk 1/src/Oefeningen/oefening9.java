package Oefeningen;

import java.util.Scanner;

public class oefening9 {
	public static void main (String[] args)
	{
		int getal;
		Scanner input = new Scanner(System.in);
		System.out.print("Geef een positief getal in: ");
		getal = input.nextInt();
		System.out.printf("%10d%10d%10d%10d%10d%n", 1,10,100,1000,10000);
		System.out.printf("%10d%10d%10d%10d%10d", 1 * getal,10* getal,100* getal,1000* getal,10000* getal);
		input.close();
	}
}
