package domein;

public class DomainController {
	private Galgje g;
	
	public void startGalgje() {
		g = new Galgje();
	}
	public void kiesLetter(String letter)
	{
		g.kiesLetter(letter);
	}
	public String getGemaskeerdWoord() {
		return g.getGemaskeerdWoord();
	}
	
	public int GetAantalMissers() {
		return g.getAantalMissers();
	}
	public String getGeheimWoord() {
		return g.getGeheimWoord();
	}
	public boolean IsEindeSpel() {
		return g.isEindeSpel();
	}
	public int getScore()
	{
		return g.getScore();
	}
}
