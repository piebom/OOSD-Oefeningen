package domein;

public class Verplaatsing {

	private String van;
	private String naar;
	private double aantalKm;

	public String getVan() {
		return this.van;
	}

	public void setVan(String value) {
		if (value == null || value.trim().isEmpty())
			throw new IllegalArgumentException("Van mag niet leeg zijn");
		this.van = value;
	}

	public String getNaar() {
		return this.naar;
	}

	public void setNaar(String value) {
		if (value == null || value.trim().isEmpty())
			throw new IllegalArgumentException("Naar mag niet leeg zijn");
		this.naar = value;
	}

	public double getAantalKm() {
		return this.aantalKm;
	}

	public void setAantalKm(double value) {
		if (value <= 0 )
			throw new IllegalArgumentException("De waarde moet positief zijn");
		this.aantalKm = value;
	}

	public Verplaatsing(String van, String naar, double aantalKm) {
		setVan(van);
		setNaar(naar);
		setAantalKm(aantalKm);
	}
	
	@Override
	public String toString() {
		return String.format("verplaatsing van %s naar %s", van,naar);
	}
}
