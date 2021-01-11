package domein;

public class VerplaatsingPerBusTram extends Verplaatsing {

	private int lijnnr;
	private boolean bus;
	private boolean stadslijn;
	private final static double PRIJS_PER_HALTE = 0.32;

	public int getLijnnr() {
		return this.lijnnr;
	}

	public void setLijnnr(int value) {
		if (value < 0)
			throw new IllegalArgumentException("De waarde moet strikt positief zijn");
		this.lijnnr = value;
	}

	public boolean isBus() {
		return this.bus;
	}

	public void setBus(boolean value) {
		this.bus = value;
	}

	public boolean isStadslijn() {
		return this.stadslijn;
	}

	public void setStadslijn(boolean value) {
		this.stadslijn = value;
	}

	public VerplaatsingPerBusTram(String van, String naar, double aantalKm, int lijnnr, boolean bus,
			boolean stadslijn) {
		super(van, naar, aantalKm);
		setLijnnr(lijnnr);
		setBus(bus);
		setStadslijn(stadslijn);
	}
@Override
	public String toString() {
    return String.format("%s met %s%d", super.toString(),(isStadslijn() ? "stads" : "") 
            + (isBus() ? "bus " : "tram "), lijnnr);	}

	public double berekenPrijs() {
        int aantalHaltes = (int) Math.ceil(getAantalKm());
        double prijs = aantalHaltes * PRIJS_PER_HALTE * 2;
        if (isStadslijn()) 
            prijs *= 0.8; 
        return prijs;
	}
}
