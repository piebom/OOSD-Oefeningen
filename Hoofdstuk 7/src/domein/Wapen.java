package domein;

public class Wapen extends Voorwerp {

	private int kracht;
	private boolean gebruikt;

	public int getKracht() {
		return this.kracht;
	}

	public void setKracht(int value) {
		if(value>-1) {
			this.kracht = value;
		}
		else {
			throw new IllegalArgumentException("De waarde is niet positief");
		}
	}

	public boolean isGebruikt() {
		return this.gebruikt;
	}

	public void setGebruikt(boolean value) {
		this.gebruikt = value;
	}

	public Wapen(String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
		super(naam, gewicht, niveau);
		controleerNiveau(niveau);
        setKracht(kracht);
        setGebruikt(gebruikt);
	}
    private void controleerNiveau(int niveau)
    {
        if (niveau > 5)
            throw new IllegalArgumentException("Wapens zijn enkel beschikbaar t.e.m. niveau 5!");
    }

	@Override
	public String toString() {
        return String.format("%s en met kracht %d %s gebruikt.",
                super.toString(), kracht, gebruikt ? "al" : "nog niet");
	}
}
