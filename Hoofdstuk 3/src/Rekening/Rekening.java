package Rekening;

public class Rekening {

	private long rekeningnummer;
	private double saldo;
	private String naam;

	public long getRekeningnummer() {
		return this.rekeningnummer;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double value) {
		this.saldo = value;
	}

	public String getNaam() {
		return this.naam;
	}

	public Rekening(long rekeningNummer, String naam) {
		throw new UnsupportedOperationException();
	}

	public Rekening(long rekeningNummer) {
		throw new UnsupportedOperationException();
	}

	public Rekening() {
		throw new UnsupportedOperationException();
	}

	private void setNaam(String naam) {
		this.naam = naam;
	}

	private void setRekeningnummer(long rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}

	public Boolean stortBedrag(long rekeningNummer) {
		throw new UnsupportedOperationException();
	}

	public Boolean afhalenBedrag(String naamHouder) {
		throw new UnsupportedOperationException();
	}
}
