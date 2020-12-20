package domein;

import java.security.SecureRandom;
import java.util.*;

public class KopOfMuntSpel {

	private List<Character> code;
	private int moeilijkheidsgraad;

	public KopOfMuntSpel(int moeilijkheidsgraad) {
		setMoeilijkheidsgraad(moeilijkheidsgraad);
		genereerCode(moeilijkheidsgraad);
	}

	public List<Character> getCode() {
		return this.code;
	}

	public int getMoeilijkheidsgraad() {
		return this.moeilijkheidsgraad;
	}

	private void setCode(List<Character> code) {
		this.code = code;
	}

	private void setMoeilijkheidsgraad(int moeilijkheidsgraad) {
		this.moeilijkheidsgraad = moeilijkheidsgraad;
	}

	private void genereerCode(int moeilijkheidsgraad) {

		SecureRandom random = new SecureRandom();
		List<Character> code = new ArrayList<>();

		for (int i = 0; i <= (1 + moeilijkheidsgraad); i++) {
			code.add(random.nextBoolean() ? 'K' : 'M');
		}

		setCode(code);
	}

	public int geefScore(List<Character> pogingCode) {
		int score = 0;

		for (int i = 0; i <= pogingCode.size() - 1; i++) {
			if (pogingCode.get(i) == code.get(i)) {
				score++;
			}
		}

		return score;
	}

	public boolean isEindeSpel(List<Character> pogingCode) {
		if (moeilijkheidsgraad == 1) {
			if (geefScore(pogingCode) == 3)
				return true;
			else
				return false;
		} else {
			if (geefScore(pogingCode) == 4)
				return true;
			else
				return false;
		}
	}
}
