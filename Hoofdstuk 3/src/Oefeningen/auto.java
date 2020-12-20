package Oefeningen;

public class auto {
	private String kleur;
	private String merk;
	private String nrplaat;
	private int snelheid;
	
	public auto() {
		snelheid = 0;
		nrplaat = "onbekend";
		merk = "onbekend";
		kleur = "grijs";
	}
	
	public auto(String kleur) {
		snelheid = 0;
		nrplaat = "onbekend";
		merk = "onbekend";
		this.kleur = kleur;
	}
	
	public auto(String kleur, String merk) {
		snelheid = 0;
		nrplaat = "onbekend";
		setMerk(merk);
		this.kleur = kleur;
	}
	public void versnel(int extraSnelheidErbij) {
		snelheid += extraSnelheidErbij;
		if (snelheid>220) {snelheid = 220;}
	}
	private void setMerk(String merk) {
		this.merk = merk;
	}
}
