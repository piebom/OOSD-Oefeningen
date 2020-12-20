package domein;

import java.util.List;

public class DomeinController {

	private KopOfMuntSpel kopOfMuntSpel;

	public void maakSpel(int moeilijkheidsgraad) {
		kopOfMuntSpel = new KopOfMuntSpel(moeilijkheidsgraad);
	}

	public int geefScore(List<Character> pogingCode) {
		return kopOfMuntSpel.geefScore(pogingCode);
	}

	public List<Character> geefCode() {
		return kopOfMuntSpel.getCode();
	}

	public int geefMoeilijkheidsgraad() {
		return kopOfMuntSpel.getMoeilijkheidsgraad();
	}

	public boolean isEindeSpel(List<Character> pogingCode) {
		return kopOfMuntSpel.isEindeSpel(pogingCode);
	}
}
