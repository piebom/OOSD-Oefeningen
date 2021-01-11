package domein;

public class VerplaatsingPerAuto extends Verplaatsing {

	private double benzineprijs;
	private double verbruik;

	public double getBenzineprijs() {
		return this.benzineprijs;
	}

	public void setBenzineprijs(double value) {
		 if (value <= 0.5 || value >= 2)
			 throw new IllegalArgumentException("De waarde moet tussen 0.5 en 2 liggen");
		this.benzineprijs = value;
	}

	public double getVerbruik() {
		return this.verbruik;
	}

	public void setVerbruik(double value) {
		if (value <= 0.02 || value >= 0.07)
			throw new IllegalArgumentException("De waarde moet tussen 0.02 en 0.07 liggen");
		this.verbruik = value;
	}

	public VerplaatsingPerAuto(String van, String naar, double aantalKm, double benzineprijs, double verbruik) {
		super(van, naar, aantalKm);
	}

	public String toString() {
		return String.format("%s per auto\nKosten voor deze verplaatsing: € %d", super.toString(),berekenPrijs());
	}

	public double berekenPrijs() {
		return verbruik * benzineprijs * super.getAantalKm() * 2;
	}
}
