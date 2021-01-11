package main;

import cui.VoorwerpApplicatie;
import cui.VerplaatsingApplicatie;

public class StartUp {
	public static void main(String[] args) {
		new VoorwerpApplicatie().start();
		new VerplaatsingApplicatie().start();
	}
}
